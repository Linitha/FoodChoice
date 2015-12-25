package com.about.java.DAO;


import com.about.java.entity.Restaurant;

import java.util.List;

/**
 * Created by Linitha on 12/19/2015.
 */
public interface RestaurantDAO {
    public void addRestaurant(Restaurant c);
    public void updateRestaurant(Restaurant c);
    public Restaurant getRestaurantByName(String restaurantName );
    public void removeRestaurant(String restaurantName);
    public List<Restaurant> listRestaurants(String Zipcode);
}
