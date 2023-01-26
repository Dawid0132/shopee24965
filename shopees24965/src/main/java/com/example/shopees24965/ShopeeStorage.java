package com.example.shopees24965;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShopeeStorage {
    List<Item> items = new ArrayList();

    public ShopeeStorage() {
        this.items.add(new Item("milk", 4.5D));
        this.items.add(new Item("beer", 3.5D));
        this.items.add(new Item("apple", 1.5D));
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return this.items;
    }
}
