package com.about.java.service;


import com.about.java.DAO.CustomerDAO;
import com.about.java.DAO.CustomerDAOImpl;
import com.about.java.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CustomerServiceImpl implements CustomerService {


        @Autowired(required=true)
        @Qualifier(value= "customerDAO")
        private CustomerDAO customerDAO;
        public void setCustomerDAO(CustomerDAO customerDAO) {
            this.customerDAO = customerDAO;
        }

        @Transactional
        public void addCustomer(Customer c) {
            this.customerDAO.addCustomer(c);
        }
        @Transactional
        public void updateCustomer(Customer c) {
            this.customerDAO.updateCustomer(c);
        }
     @Transactional
    public Customer getCustomerById(String emailId) {
        return null;
    }


//        @Transactional
//        public List<Customer> listPersons() {
//            return this.customerDAO.listCustomer();
//        }

        @Transactional
        public void removeCustomer(String emailID) {
            this.customerDAO.removeCustomer(emailID);
        }

    }
