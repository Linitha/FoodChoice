package com.about.java.DAO;


import com.about.java.entity.Order;

import java.util.List;

public interface OrderDAO {
    public void addOrder(Order o);
    public void updateOrder(Order o);
    public Order getOrderByID(String OrderID );
    public void removeOrder(String OrderID);
    public List<Order> listOrdersByRestaurantID(String RestaurantID);
}
