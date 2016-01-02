package com.about.java.DAO;

import com.about.java.entity.FoodOrders;
import com.about.java.entity.Order;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FoodOrdersDAOImpl implements FoodOrdersDAO {
    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    public List<FoodOrders> getFoodOrders(String orderId) {
        Session session = this.sessionFactory.getCurrentSession();
        String hql = "From com.about.java.entity.FoodOrders where OrderID = :OrderID";
        Query query = session.createQuery(hql);
        query.setParameter("OrderID",orderId);
        List<FoodOrders> FoodOrderList = query.list();
        return FoodOrderList;
    }
}
