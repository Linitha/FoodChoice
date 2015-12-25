package com.about.java.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name= "restaurant")
// uniqueConstraints = {
//        @UniqueConstraint(columnNames = "RestaurantID")
//})

public class Restaurant implements java.io.Serializable {

    private String restaurantName;
    private String restaurantID;
    private String zipCode;
    private Set<Menu> menu = new HashSet<Menu>(
            0);

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name= "RestaurantID")
    public String getRestaurantID() {
        return restaurantID;
    }
    @Column(name = "RestaurantName")
    public String getRestaurantName() {
        return restaurantName;
    }
    @Column(name = "ZipCode")
    public String getZipCode() {
        return zipCode;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "restaurant",  cascade = CascadeType.ALL)
    public Set<Menu> getMenu() {
        return this.menu;
    }

    public void setRestaurantID(String restaurantID) {
        this.restaurantID = restaurantID;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setMenu(Set<Menu> stockDailyRecords) {
        this.menu = stockDailyRecords;
    }




}

