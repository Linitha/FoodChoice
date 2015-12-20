package com.about.java.controllers;


import com.about.java.model.MenuModel;
import com.about.java.model.Order;
import com.about.java.model.PaymentModel;
import com.about.java.model.RestaurantModel;
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
    @RequestMapping(value = "/restaurant/{restaurantName}", method = RequestMethod.GET)
    public ModelAndView showMenu(@PathVariable("restaurantName") String name) {
        ModelAndView mav = new ModelAndView("foodChoice/menu");
        MenuModel menuModel = new MenuModel();
        return menuModel.getMenu(name,mav);
    }

    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public ModelAndView submitForm(@ModelAttribute("selectedItems") List<String> selectedItems, Model model) {
        ModelAndView mav = new ModelAndView("foodChoice/payment");
        mav.addObject("payment", new PaymentModel());
        return mav;
}



}
