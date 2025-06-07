package com.example.demo.service;

import com.example.demo.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final List<Customer> items = new ArrayList<>();
    private long currentId = 1;

    public Customer createItem(Customer item) {
        item.setId(currentId++);
        items.add(item);
        return item;
    }

    public List<Customer> getAllItems() {
        return items;
    }

    public Optional<Customer> getItemById(long id) {
        return items.stream().filter(item -> item.getId() == id).findFirst();
    }

    public Customer updateItem(long id, Customer updatedItem) {
        Customer item = getItemById(id).orElseThrow(() -> new RuntimeException("Item not found"));
        item.setName(updatedItem.getName());
        item.setDescription(updatedItem.getDescription());
        return item;
    }

    public void deleteItem(long id) {
        Customer item = getItemById(id).orElseThrow(() -> new RuntimeException("Item not found"));
        items.remove(item);
    }
}