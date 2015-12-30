package com.about.java.DAO;

import com.about.java.entity.Restaurant;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RestaurantDAOImpl implements RestaurantDAO {
    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    public void addRestaurant(Restaurant r) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(r);

    }

    public void updateRestaurant(Restaurant r) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(r);

    }

    public Restaurant getRestaurantByName(String restaurantName) {
        Session session = this.sessionFactory.getCurrentSession();
        Restaurant r = (Restaurant) session.load(Restaurant.class, new String(restaurantName));
        return r;
    }

    public Restaurant getRestaurantByLoginUserID(String loginUserID) {
        String hql = "FROM Restaurant R WHERE R.loginUserID = :loginUserID";
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery(hql);
        query.setParameter("loginUserID",loginUserID);
        Restaurant r = (Restaurant) query.list().get(0);
        return r;
    }


    public void removeRestaurant(String restaurantName) {
        Session session = this.sessionFactory.getCurrentSession();
        Restaurant r = (Restaurant) session.load(Restaurant.class, new Integer(restaurantName));
        if(null != r) {
            session.delete(r);
        }
    }


    @SuppressWarnings("unchecked")
    public List<Restaurant> listRestaurants(String ZipCode) {
        Session session = this.sessionFactory.getCurrentSession();
        String hql = "From com.about.java.entity.Restaurant where zipCode = :ZipCode";
        Query query = session.createQuery(hql);
        query.setParameter("ZipCode",ZipCode);
        List<Restaurant> restaurantList = query.list();

        return restaurantList;
    }
}
