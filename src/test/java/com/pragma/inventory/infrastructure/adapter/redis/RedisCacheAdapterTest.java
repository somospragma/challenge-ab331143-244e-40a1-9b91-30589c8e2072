package com.pragma.inventory.infrastructure.adapter.redis;

import com.pragma.inventory.domain.model.InventoryItem;
import com.pragma.inventory.application.port.out.InventoryPort;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import reactor.core.publisher.Mono;
import static org.junit.jupiter.api.Assertions.*;

class RedisCacheAdapterTest {
    @Test
    void getInventoryItem_shouldReturnInventoryItemFromCache() {
        ReactiveRedisTemplate<String, InventoryItem> redisTemplate = Mockito.mock(ReactiveRedisTemplate.class);
        RedisCacheAdapter adapter = new RedisCacheAdapter(redisTemplate);
        Mockito.when(redisTemplate.opsForValue().get("inventory:1")).thenReturn(Mono.just(new InventoryItem(1L, "Cached Item", 5)));
        Mono<InventoryItem> result = adapter.getInventoryItem(1L);
        assertNotNull(result);
    }
}