package com.about.java.service;



import com.about.java.DAO.CustomerDAO;
import com.about.java.DAO.RestaurantDAO;
import com.about.java.entity.Customer;
import com.about.java.entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class RestaurantServiceImpl implements RestaurantService {
    @Autowired(required=true)
    @Qualifier(value= "restaurantDAO")
    private RestaurantDAO restaurantDAO;
    public void setRestaurantDAO(RestaurantDAO restaurantDAO) {
        this.restaurantDAO = restaurantDAO;
    }

    @Transactional
    public void addRestaurant(Restaurant r) {
        this.restaurantDAO.addRestaurant(r);
    }
    @Transactional
    public void updateRestaurant(Restaurant r) {
        this.restaurantDAO.updateRestaurant(r);
    }
    @Transactional
    public Restaurant getRestaurantByZip(String name) {
        return null;
    }

    @Transactional
    public Restaurant getRestaurantByUser(String loginUserID) {
        return this.restaurantDAO.getRestaurantByLoginUserID(loginUserID);
    }

    @Transactional
        public List<Restaurant> listRestaurants(String ZipCode) {
            return this.restaurantDAO.listRestaurants(ZipCode);
        }

    @Transactional
    public void removeRestaurantByName(String name) {
        this.restaurantDAO.removeRestaurant(name);
    }
}
