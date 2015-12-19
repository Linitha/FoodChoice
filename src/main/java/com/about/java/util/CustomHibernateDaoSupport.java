package com.about.java.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class CustomHibernateDaoSupport extends HibernateDaoSupport {

    @Autowired
    public void hibernateUtil(SessionFactory sessionFactory)
    {
        setSessionFactory(sessionFactory);
    }
}
