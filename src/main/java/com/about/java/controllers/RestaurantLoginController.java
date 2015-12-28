package com.about.java.controllers;


import com.about.java.entity.Customer;
import com.about.java.entity.Restaurant;
import com.about.java.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/restaurant/login")
public class RestaurantLoginController {
    private RestaurantService restaurantService;

    @Autowired(required=true)
    @Qualifier(value="restaurantService")
    public void setRestaurantService(RestaurantService restaurantService){
        this.restaurantService = restaurantService;
    }

        @RequestMapping(method = RequestMethod.GET)
        public String displayLogin(ModelMap model) {
            Restaurant restaurant = new Restaurant();
            model.addAttribute("restaurant", restaurant);
            return "foodChoice/restaurantLogin";
        }
    @RequestMapping(method = RequestMethod.POST)
    public String submit(ModelMap modelMap, @ModelAttribute("restaurant") Restaurant restaurant,HttpServletRequest request) {
        String userID = restaurant.getLoginUserID();
        String password = restaurant.getLoginPassword();

        String restaurantPassword = restaurantService.getRestaurantByUser(userID).getLoginPassword();
        if (password != null && restaurantPassword !=null&& password.equals(restaurantPassword)) {
            request.getSession().setAttribute("loggedInRestaurant",restaurantService.getRestaurantByUser(userID) );
            modelMap.put("restaurantInfo", restaurant.getRestaurantName());
            return "foodChoice/restaurant";
        } else {
            modelMap.put("error", "Invalid UserName / Password");
            return "foodChoice/restaurantLogin";
        }
    }
}
