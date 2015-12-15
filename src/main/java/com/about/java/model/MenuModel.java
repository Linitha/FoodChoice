package com.about.java.model;


import org.springframework.web.servlet.ModelAndView;
import repository.FoodChoiceRepository;
import repository.MenuItem;

import java.util.List;

public class MenuModel {
    public ModelAndView getMenu(String restaurantName,ModelAndView mav) {
        FoodChoiceRepository foodChoiceRepository = new FoodChoiceRepository();
        List<MenuItem> menuItems = foodChoiceRepository.getMenuItems(restaurantName);
        Order order = new Order();
        order.setItems(menuItems);
        mav.addObject("order", order);

    return mav;
    }

}
