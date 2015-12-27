package com.about.java.model;


import com.about.java.entity.Menu;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Order implements java.io.Serializable {
    List<Menu> items;
    ArrayList<String> selectedItems;
}

