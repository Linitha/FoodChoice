package com.about.java.DAO;

import com.about.java.entity.Order;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDAOImpl implements OrderDAO {
    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    public void addOrder(Order o) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(o);
    }

    public void updateOrder(Order o) {

    }

    public Order getOrderByID(String OrderID) {
        return null;
    }

    public void removeOrder(String OrderID) {

    }

    public List<Order> listOrdersByRestaurantID(String restaurantID) {
        Session session = this.sessionFactory.getCurrentSession();
        String hql = "From com.about.java.entity.Order where RestaurantID = :RestaurantID";
        Query query = session.createQuery(hql);
        query.setParameter("RestaurantID",restaurantID);
        List<Order> orderList = query.list();
        return orderList;
    }
}
