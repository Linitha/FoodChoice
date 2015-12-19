package com.about.java.service;


import com.about.java.entity.Customer;

public interface CustomerService {
    public void addCustomer(Customer p);
    public void updateCustomer(Customer p);
    public Customer getCustomerById(String emailId);
    public void removeCustomer(String emailId);
        }
