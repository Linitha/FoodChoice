package com.about.java.service;

import com.about.java.DAO.OrderDAO;
import com.about.java.entity.FoodOrders;
import com.about.java.entity.Menu;
import com.about.java.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired(required=true)
    @Qualifier(value= "orderDAO")

    private OrderDAO orderDAO;
    public void setOrderDAO(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }
    @Transactional
    public void createOrder(ArrayList<Menu> selectedItems,String RestaurantID) {

        Order order = new Order();

        order.setNumberOfItems(calculateNoOfItems(selectedItems));
        order.setOrderTotal(calculateOrderTotal(selectedItems));
        order.setCustomerEmailID("linithareddy@gmail.com");
        order.setOrderStatus("Ordered");
        order.setRestaurantID(RestaurantID);
        order.setFoodOrders(setFoodOrders(selectedItems));
        orderDAO.addOrder(order);
    }
    private int calculateNoOfItems(ArrayList<Menu> selectedItems){
        int noOfItems = 0;
        if(selectedItems !=null)
        {
            noOfItems=selectedItems.size();
        }
        return noOfItems;
    }
    private double calculateOrderTotal(ArrayList<Menu> selectedItems){
        double total = 0.00;
        if(selectedItems != null)
        {
            for(Menu menuItem: selectedItems)
            {
                total=total+menuItem.getPrice();
            }
        }
    return total;
    }

    private Set<FoodOrders> setFoodOrders(ArrayList<Menu> selectedItems)
    {
        Set<FoodOrders> foodOrdersSet = new HashSet<FoodOrders>();
        for(Menu menuItem: selectedItems)
        {
            FoodOrders foodOrders = new FoodOrders();
            foodOrders.setItem(menuItem.getItemName());
            foodOrders.setPrice(menuItem.getPrice());
            foodOrdersSet.add(foodOrders);
        }
        return foodOrdersSet;
    }



}
