package com.about.java.DAO;


import com.about.java.entity.Menu;
import com.about.java.entity.Restaurant;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class MenuDAOImpl implements MenuDAO {
    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    public void addMenuItem(Menu m) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(m);

    }

    public void updateMenu(Menu m) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(m);

    }

    public Menu getMenuByName(String Name) {
        Session session = this.sessionFactory.getCurrentSession();
        Menu m = (Menu) session.load(Menu.class, new String(Name));
        return m;
    }

    public void removeMenu(String MenuName) {
        Session session = this.sessionFactory.getCurrentSession();
        Menu m = (Menu) session.load(Restaurant.class, new Integer(MenuName));
        if(null != m) {
            session.delete(m);
        }

    }

    public List<Menu> listMenuItems(String restaurantID) {
            Session session = this.sessionFactory.getCurrentSession();
            String hql = "From com.about.java.entity.Menu where RestaurantID = :RestaurantID";
            Query query = session.createQuery(hql);
            query.setParameter("RestaurantID",restaurantID);
            List<Menu> menuList = query.list();
        return menuList;
    }
}
