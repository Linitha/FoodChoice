package com.about.java.service;

import com.about.java.entity.Restaurant;

import java.util.List;

public interface RestaurantService {
    public void addRestaurant(Restaurant restaurant);
    public void updateRestaurant(Restaurant restaurant);
    public Restaurant getRestaurantByZip(String zipCode);
    public List<Restaurant> listRestaurants(String ZipCode);
    public void removeRestaurantByName(String emailId);
}

