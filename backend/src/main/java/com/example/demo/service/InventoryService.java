package com.example.demo.service;

import com.example.demo.Exception.InventoryNotFoundException;
import com.example.demo.model.Inventory;
import com.example.demo.repository.InventoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {
	@Autowired
    private  InventoryRepository inventoryRepository;

   
 

    public Inventory createInventory(Inventory newInventory) {
        return inventoryRepository.save(newInventory);
    }

    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }

    public Inventory getInventoryById(Long id) {
        return inventoryRepository.findById(id)
                .orElseThrow(() -> new InventoryNotFoundException(id));
    }

    public Inventory updateInventory(Inventory updatedInventory) {
        Long id = updatedInventory.getId();
        Inventory existingInventory = inventoryRepository.findById(id)
                .orElseThrow(() -> new InventoryNotFoundException(id));

        existingInventory.setName(updatedInventory.getName());
        existingInventory.setQuantity(updatedInventory.getQuantity());
        existingInventory.setCategory(updatedInventory.getCategory());
        existingInventory.setPrice(updatedInventory.getPrice());
        existingInventory.setSupplier(updatedInventory.getSupplier());

        return inventoryRepository.save(existingInventory);
    }

    public void deleteInventory(Long id) {
        if (!inventoryRepository.existsById(id)) {
            throw new InventoryNotFoundException(id);
        }
        inventoryRepository.deleteById(id);
    }
}
