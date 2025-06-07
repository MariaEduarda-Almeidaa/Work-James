package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class CustomerController {

    @Autowired
    private CustomerService itemService;

    @PostMapping
    public ResponseEntity<Customer> createItem(@RequestBody Customer item) {
        Customer createdItem = itemService.createItem(item);
        return ResponseEntity.ok(createdItem);
    }

    @GetMapping
    public ResponseEntity<List<Customer>> getAllItems() {
        List<Customer> items = itemService.getAllItems();
        return ResponseEntity.ok(items);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getItemById(@PathVariable Long id) {
        return itemService.getItemById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateItem(@PathVariable Long id, @RequestBody Customer item) {
        Customer updatedItem = itemService.updateItem(id, item);
        return ResponseEntity.ok(updatedItem);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable Long id) {
        itemService.deleteItem(id);
        return ResponseEntity.noContent().build();
    }
}