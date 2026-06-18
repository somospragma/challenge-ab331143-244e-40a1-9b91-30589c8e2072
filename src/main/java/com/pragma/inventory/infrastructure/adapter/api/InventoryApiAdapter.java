package com.pragma.inventory.infrastructure.adapter.api;

import com.pragma.inventory.domain.model.InventoryItem;
import com.pragma.inventory.domain.service.InventoryService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/inventory")
public class InventoryApiAdapter {
    private final InventoryService inventoryService;

    public InventoryApiAdapter(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<InventoryItem> getInventoryItem(@PathVariable Long id) {
        return inventoryService.getInventoryItem(id);
    }
}