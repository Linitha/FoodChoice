package com.about.java.DAO;

import com.about.java.entity.Customer;


    public interface CustomerDAO {

        public void addCustomer(Customer c);
        public void updateCustomer(Customer c);
        public Customer getCustomerById(String emailID );
        public void removeCustomer(String emailID);
    }

