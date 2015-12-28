package com.about.java.controllers;

import com.about.java.entity.Customer;
import com.about.java.entity.Restaurant;
import com.about.java.model.RestaurantModel;
import com.about.java.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import repository.MenuItem;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Controller

public class RestaurantController {


    private RestaurantService restaurantService;

    @Autowired(required=true)
    @Qualifier(value="restaurantService")
    public void setRestaurantService(RestaurantService rs){
        this.restaurantService = rs;
    }

    @RequestMapping(value="/zipcode",method = RequestMethod.GET)
    public String ViewZipcode()
    {
        return("foodChoice/zipcode");
    }
<<<<<<< Updated upstream
    
=======

>>>>>>> Stashed changes
    @RequestMapping(value="/restaurant",method = RequestMethod.POST)
    public ModelAndView postRestaurantList(@ModelAttribute("ZipCode") String ZipCode, Model model)
    {
        model.addAttribute("listOfRestaurants", this.restaurantService.listRestaurants(ZipCode));
        ModelAndView mav = new ModelAndView("foodChoice/restaurant");
        mav.addObject("msg", ZipCode);
        return mav;

    }


}
