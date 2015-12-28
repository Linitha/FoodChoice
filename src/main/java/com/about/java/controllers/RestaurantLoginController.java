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

@Controller
@RequestMapping("/restaurant/login")
public class RestaurantLoginController {
    private RestaurantService restaurantService;

    @Autowired(required=true)
    @Qualifier(value="restaurantService")
    public void setRestaurantService(RestaurantService rs){
        this.restaurantService = rs;
    }

        @RequestMapping(method = RequestMethod.GET)
        public String displayLogin(ModelMap model) {
            Restaurant restaurant = new Restaurant();
            model.addAttribute("restaurant", restaurant);
            return "foodChoice/restaurantLogin";
        }
    @RequestMapping(method = RequestMethod.POST)
    public String submit(ModelMap modelMap, @ModelAttribute("restaurant") Restaurant restaurant) {
        System.out.println(restaurant.getLoginUserID());
        System.out.println(restaurant.getLoginPassword());
        String password = restaurant.getLoginPassword();
        if (password != null && password.equals("rest")) {
            modelMap.put("restaurantInfo", restaurant.getRestaurantName());
            return "foodChoice/restaurant";
        } else {
            modelMap.put("error", "Invalid UserName / Password");
            return "foodChoice/restaurantLogin";
        }
    }
}
