package com.about.java.DAO;

import com.about.java.entity.Customer;
import com.about.java.util.CustomHibernateDaoSupport;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImpl  implements CustomerDAO {
    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    public void addCustomer(Customer c) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(c);

    }


    public void updateCustomer(Customer c) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(c);

    }

//    @SuppressWarnings("unchecked")
//
//    public List<Customer> listCustomers() {
//        Session session = this.sessionFactory.getCurrentSession();
//        List<Customer> customersList = session.createQuery("from customer").list();
//
//        return customersList;
//    }


    public Customer getCustomerById(String emailID) {
        Session session = this.sessionFactory.getCurrentSession();
        Customer c = (Customer) session.load(Customer.class, new String(emailID));
        return c;
    }


    public void removeCustomer(String emailID) {
        Session session = this.sessionFactory.getCurrentSession();
        Customer c = (Customer) session.load(Customer.class, new Integer(emailID));
        if(null != c){
            session.delete(c);
        }

    }

}

