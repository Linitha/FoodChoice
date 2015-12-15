package com.about.java.model;


import repository.MenuItem;

import java.util.List;

public class Order {
    List<MenuItem> items;

    public List<MenuItem> getItems() {
        return items;
    }
    public void setItems(List<MenuItem> items) {
        this.items = items;
    }
}

