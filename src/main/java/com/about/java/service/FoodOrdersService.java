package com.about.java.service;


import com.about.java.entity.FoodOrders;


import java.util.List;

public interface FoodOrdersService {

    public List<FoodOrders> getFoodOrders(String restaurantId);
}
