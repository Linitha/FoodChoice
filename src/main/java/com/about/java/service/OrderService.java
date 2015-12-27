package com.about.java.service;


import com.about.java.entity.Menu;

import java.util.ArrayList;

public interface OrderService{

public void createOrder(ArrayList<Menu> selectedItems,String restaurantID);

}
