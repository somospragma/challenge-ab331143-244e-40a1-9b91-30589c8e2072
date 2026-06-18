package com.pragma.inventory.infrastructure.adapter.redis;

import com.pragma.inventory.domain.model.InventoryItem;
import com.pragma.inventory.application.port.out.InventoryPort;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class RedisCacheAdapter implements InventoryPort {
    private final ReactiveRedisTemplate<String, InventoryItem> redisTemplate;

    public RedisCacheAdapter(ReactiveRedisTemplate<String, InventoryItem> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public Mono<InventoryItem> getInventoryItem(Long id) {
        return redisTemplate.opsForValue().get("inventory:" + id);
    }
}