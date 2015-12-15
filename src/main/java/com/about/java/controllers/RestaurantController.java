package com.about.java.controllers;

import com.about.java.model.RestaurantModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class RestaurantController {
    @RequestMapping(value = "/restaurant")
    public ModelAndView getRestaurants()
    {
        ModelAndView mav = new ModelAndView("foodChoice/restaurant");
        RestaurantModel restaurantModel = new RestaurantModel();
        return restaurantModel.getRestaurants(mav);
    }
}
