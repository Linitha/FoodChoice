package com.about.java.DAO;

import com.about.java.entity.FoodOrders;

import java.util.List;


public interface FoodOrdersDAO {
    public List<FoodOrders> getFoodOrders(String orderId);
}

