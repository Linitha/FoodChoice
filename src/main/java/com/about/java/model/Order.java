package com.about.java.model;


import lombok.Getter;
import lombok.Setter;
import repository.MenuItem;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Order {
    List<MenuItem> items;
    List<String> selectedItems;
}

