package com.about.java.DAO;


import com.about.java.entity.Menu;

import java.util.List;


public interface MenuDAO {
        public void addMenuItem(Menu m);
        public void updateMenu(Menu m);
        public Menu getMenuByName(String Name );
        public void removeMenu(String restaurantName);
        public List<Menu> listMenuItems(String RestaurantID);
    }

