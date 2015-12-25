package com.about.java.entity;

import javax.persistence.*;

@Entity
@Table(name= "customer", uniqueConstraints = {
        @UniqueConstraint(columnNames = "EmailID")
})
public class Customer implements java.io.Serializable {

    private int customerId;
    private String emailID;
    private String firstName;
    private String lastName;
    private String password;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name= "CustomerId")
    public int getCustomerId() {
        return customerId;
    }
    @Column(name="FirstName")
    public String getFirstName() {
        return firstName;
    }
    @Column(name="LastName")
    public String getLastName() {
        return lastName;
    }
    @Column(name="Password")
    public String getPassword() {
        return password;
    }
    @Column(name="EmailID")
    public String getEmailID() {
        return emailID;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    }


