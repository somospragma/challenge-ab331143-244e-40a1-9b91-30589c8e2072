package com.pragma.inventory.domain.service;

import com.pragma.inventory.domain.model.InventoryItem;
import com.pragma.inventory.application.port.out.InventoryPort;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class InventoryService {
    private final InventoryPort inventoryPort;

    public InventoryService(InventoryPort inventoryPort) {
        this.inventoryPort = inventoryPort;
    }

    public Mono<InventoryItem> getInventoryItem(Long id) {
        return inventoryPort.getInventoryItem(id);
    }
}