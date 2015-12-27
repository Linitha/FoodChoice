package com.about.java.service;

import com.about.java.DAO.MenuDAO;
import com.about.java.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired(required=true)
    @Qualifier(value= "menuDAO")
    private MenuDAO menuDAO;
    public void setMenuDAO(MenuDAO menuDAO) {
                this.menuDAO = menuDAO;
            }
    @Transactional
    public void addMenuItem(Menu m) {
                this.menuDAO.addMenuItem(m);
            }
    @Transactional
    public void updateMenu(Menu m) {
                this.menuDAO.updateMenu(m);
            }
    @Transactional
    public Menu getMenuByName(String name) {
                return null;
            }
    @Transactional
    public List<Menu> listMenuItems(String RestaurantID) {
        return this.menuDAO.listMenuItems(RestaurantID);
            }
    @Transactional
            public void removeMenu(String name) {
                this.menuDAO.removeMenu(name);
            }
        }


