package com.about.java.service;


import com.about.java.entity.Menu;

import java.util.List;

public interface MenuService {
    public void addMenuItem(Menu m);
    public void updateMenu(Menu m);
    public Menu getMenuByName(String Name );
    public void removeMenu(String restaurantName);
    public List<Menu> listMenuItems(String RestaurantID);
}
