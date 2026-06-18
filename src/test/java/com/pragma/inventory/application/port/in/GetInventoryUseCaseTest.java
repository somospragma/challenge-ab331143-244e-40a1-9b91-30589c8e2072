package com.pragma.inventory.application.port.in;

import com.pragma.inventory.domain.model.InventoryItem;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import static org.junit.jupiter.api.Assertions.*;

class GetInventoryUseCaseTest {
    @Test
    void getInventoryItem_shouldReturnInventoryItem() {
        GetInventoryUseCase useCase = () -> Mono.just(new InventoryItem(1L, "Test Item", 10));
        Mono<InventoryItem> result = useCase.getInventoryItem(1L);
        assertNotNull(result);
    }
}