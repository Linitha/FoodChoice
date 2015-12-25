package com.about.java.controllers;


import com.about.java.entity.Menu;
import com.about.java.model.MenuModel;
import com.about.java.model.Order;
import com.about.java.model.PaymentModel;
import com.about.java.model.RestaurantModel;
import com.about.java.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MenuController {
    private MenuService menuService;

    @Autowired(required=true)
    @Qualifier(value="menuService")
    public void setMenuService(MenuService ms){
        this.menuService = ms;
    }
    @RequestMapping(value = "/restaurant/{restaurantID}", method = RequestMethod.GET)
    public ModelAndView showMenu(@PathVariable("restaurantID") String restaurantID) {
        ModelAndView mav = new ModelAndView("foodChoice/menu");
        List<Menu> menuItems = menuService.listMenuItems(restaurantID);
        Order order = new Order();
        order.setItems(menuItems);
        mav.addObject("order", order);
        return mav;
    }


    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public ModelAndView submitForm(@ModelAttribute("selectedItems") List<Menu> selectedItems, Model model) {
        ModelAndView mav = new ModelAndView("foodChoice/payment");
        mav.addObject("payment", new PaymentModel());
        return mav;
}

}
