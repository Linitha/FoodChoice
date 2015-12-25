package com.about.java.model;


import com.about.java.entity.Menu;
import com.about.java.service.MenuService;
import com.about.java.service.MenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import repository.FoodChoiceRepository;
import repository.MenuItem;


import javax.annotation.Resource;
import java.util.List;

@Component
public class MenuModel {
    @Resource(name = "menuService")
    private MenuService menuService;

    @Autowired(required=true)
    @Qualifier(value="menuService")
    public void setMenuService(MenuService ms){
        this.menuService = ms;
    }

    public ModelAndView getMenu(String restaurantID,ModelAndView mav) {
        MenuService menuService = new MenuServiceImpl();
        List<Menu> menuItems = menuService.listMenuItems(restaurantID);
        Order order = new Order();
        order.setItems(menuItems);
        mav.addObject("order", order);
    return mav;
    }

}
