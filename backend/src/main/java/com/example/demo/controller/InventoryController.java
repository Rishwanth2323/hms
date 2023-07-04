package com.example.demo.controller;

import com.example.demo.model.Inventory;
import com.example.demo.service.InventoryService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/inventory")
public class InventoryController {

    private final InventoryService inventoryService;


    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @PostMapping
    public ResponseEntity<Inventory> newInventory(@RequestBody Inventory newInventory) {
        Inventory createdInventory = inventoryService.createInventory(newInventory);
        return ResponseEntity.ok(createdInventory);
    }

    @GetMapping
    public List<Inventory> getAllInventorys() {
        return inventoryService.getAllInventory();
    }

    @GetMapping("/{id}")
    public Inventory getInventoryById(@PathVariable Long id) {
        return inventoryService.getInventoryById(id);
    }

    @PutMapping
    public ResponseEntity<Inventory> updateInventory(@RequestBody Inventory updatedInventory) {
        Inventory savedInventory = inventoryService.updateInventory(updatedInventory);
        return ResponseEntity.ok(savedInventory);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteInventory(@PathVariable Long id) {
        inventoryService.deleteInventory(id);
        return ResponseEntity.ok("Deleted");
    }
}
