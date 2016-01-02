package com.about.java.service;

import com.about.java.DAO.FoodOrdersDAO;
import com.about.java.DAO.OrderDAO;
import com.about.java.entity.FoodOrders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FoodOrdersServiceImpl implements FoodOrdersService {
    @Autowired(required=true)
    @Qualifier(value= "foodOrdersDAO")

    private FoodOrdersDAO foodOrdersDAO;
    public void setFoodOrdersDAO(FoodOrdersDAO foodOrdersDAO) {
        this.foodOrdersDAO = foodOrdersDAO;
    }

@Transactional
    public List<FoodOrders> getFoodOrders(String orderId) {
        return foodOrdersDAO.getFoodOrders(orderId);
    }
}
