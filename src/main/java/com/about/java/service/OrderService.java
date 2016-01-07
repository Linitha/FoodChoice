package com.about.java.service;


import com.about.java.entity.Menu;
import com.about.java.entity.Order;

import java.util.ArrayList;
import java.util.List;

public interface OrderService{

    public void createOrder(ArrayList<Menu> selectedItems,String restaurantID);
    public void updateOrder(String OrderID);
    public List<Order> getOrders(String restaurantId);

}
