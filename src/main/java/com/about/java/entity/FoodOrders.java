package com.about.java.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "foodorders")
public class FoodOrders {

    private String orderID ;
    private String item;
    private double price;
    private int quantity;

    @Column(name="OrderID")
    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    @Column(name = "Item")
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        item = item;
    }

    @Column(name ="Price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Column(name = "Quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
