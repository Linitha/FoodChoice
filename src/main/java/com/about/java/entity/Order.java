package com.about.java.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name= "orders")
public class Order {
    private String orderID;
    private double orderTotal;
    private int numberOfItems;
    private String restaurantID;
    private String customerEmailID;
    private String orderStatus;
    private Set<FoodOrders> foodOrders = new HashSet<FoodOrders>(
            0);

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name= "OrderID")
    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    @Column(name = "OrderTotal")
    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }
    @Column(name = "NumberOfItems")
    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }
    @Column(name = "RestaurantID")
    public String getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(String restaurantID) {
        this.restaurantID = restaurantID;
    }

    @Column(name = "CustomerEmailID")
    public String getCustomerEmailID() {
        return customerEmailID;
    }

    public void setCustomerEmailID(String customerEmailID) {
        this.customerEmailID = customerEmailID;
    }

    @Column(name = "OrderStatus")
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
    public Set<FoodOrders> getFoodOrders() {
        return this.foodOrders;
    }

    public void setFoodOrders(Set<FoodOrders> foodOrders) {
        this.foodOrders = foodOrders;
    }


}
