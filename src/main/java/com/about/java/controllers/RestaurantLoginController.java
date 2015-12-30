package com.about.java.controllers;


import com.about.java.entity.Customer;
import com.about.java.entity.Order;
import com.about.java.entity.Restaurant;
import com.about.java.service.OrderService;
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
    private OrderService orderService;

    @Autowired(required=true)
    @Qualifier(value="restaurantService")
    public void setRestaurantService(RestaurantService restaurantService){
        this.restaurantService = restaurantService;
    }
    @Autowired(required=true)
    @Qualifier(value="orderService")
    public void setMenuService(OrderService os){
        this.orderService = os;
    }

        @RequestMapping(method = RequestMethod.GET)
        public String displayLogin(ModelMap model) {
            Restaurant restaurant = new Restaurant();
            model.addAttribute("restaurant", restaurant);
            return "foodChoice/restaurantLogin";
        }
    @RequestMapping(method = RequestMethod.POST)
    public String submit(Model model, @ModelAttribute("restaurant") Restaurant restaurant,HttpServletRequest request) {
        String userID = restaurant.getLoginUserID();
        String password = restaurant.getLoginPassword();

        String restaurantPassword = restaurantService.getRestaurantByUser(userID).getLoginPassword();
        if (password != null && restaurantPassword !=null&& password.equals(restaurantPassword)) {
            Restaurant loggedInRestaurant=restaurantService.getRestaurantByUser(userID);
            model.addAttribute("listOfOrders", orderService.getOrders(loggedInRestaurant.getRestaurantID()));
            return "foodChoice/vieworders";
        } else {
            model.addAttribute("error", "Invalid UserName / Password");
            return "foodChoice/restaurantLogin";
        }
    }
}
