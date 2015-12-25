package com.about.java.model;


import com.about.java.entity.Menu;
import lombok.Getter;
import lombok.Setter;
import repository.MenuItem;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Order {
    List<Menu> items;
    List<Menu> selectedItems;
}

