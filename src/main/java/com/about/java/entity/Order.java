package com.about.java.entity;

import javax.persistence.*;

@Entity
@Table(name= "order")
public class Order {
    private String ordeID;
    private double orderTotal;
    private int numberOfItems;
    private String restaurantID;
    private String customerEmailID;
    private String status;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name= "OrderID")
    public String getOrdeID() {
        return ordeID;
    }

    public void setOrdeID(String ordeID) {
        this.ordeID = ordeID;
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

    @Column(name = "Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
