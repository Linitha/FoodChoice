package com.about.java.entity;

import javax.persistence.*;

@Entity
@Table(name= "menu")
public class Menu implements java.io.Serializable{
    private String ItemID;
    private Restaurant restaurant;
    private String ItemName;
    private double price;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name= "ItemID")
    public String getItemID() {
        return ItemID;
    }

    public void setItemID(String itemID) {
        ItemID = itemID;
    }

    @ManyToOne
    @JoinColumn(name = "RestaurantID")
    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Column(name = "ItemName")
    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    @Column(name = "price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
