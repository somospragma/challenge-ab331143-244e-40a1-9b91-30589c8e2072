package com.pragma.inventory.application.port.out;

import com.pragma.inventory.domain.model.InventoryItem;
import reactor.core.publisher.Mono;

public interface InventoryPort {
    Mono<InventoryItem> getInventoryItem(Long id);
}