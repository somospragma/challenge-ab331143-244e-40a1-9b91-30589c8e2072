package com.pragma.inventory.application.port.in;

import com.pragma.inventory.domain.model.InventoryItem;
import reactor.core.publisher.Mono;

public interface GetInventoryUseCase {
    Mono<InventoryItem> getInventoryItem(Long id);
}