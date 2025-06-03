package com.example.demo.service;

import com.example.demo.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    private final List<Item> items = new ArrayList<>();
    private long currentId = 1;

    public Item createItem(Item item) {
        item.setId(currentId++);
        items.add(item);
        return item;
    }

    public List<Item> getAllItems() {
        return items;
    }

    public Optional<Item> getItemById(long id) {
        return items.stream().filter(item -> item.getId() == id).findFirst();
    }

    public Item updateItem(long id, Item updatedItem) {
        Item item = getItemById(id).orElseThrow(() -> new RuntimeException("Item not found"));
        item.setName(updatedItem.getName());
        item.setDescription(updatedItem.getDescription());
        return item;
    }

    public void deleteItem(long id) {
        Item item = getItemById(id).orElseThrow(() -> new RuntimeException("Item not found"));
        items.remove(item);
    }
}