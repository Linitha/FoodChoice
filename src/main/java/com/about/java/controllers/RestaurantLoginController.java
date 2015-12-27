package com.about.java.controllers;


import com.about.java.entity.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/restaurant/login")
public class RestaurantLoginController {

        @RequestMapping(method = RequestMethod.GET)
        public String init(ModelMap modelMap) {
            modelMap.put("info", "Hello User");
            return "foodChoice/restaurantLogin";
        }
    @RequestMapping(method = RequestMethod.POST)
    public String submit(ModelMap modelMap, @ModelAttribute("loginModel") Customer customer) {
        System.out.println("in submit" + customer);
        String password = customer.getPassword();

        if (password != null && password.equals("rest")) {
            modelMap.put("userInfo", customer.getFirstName());
            return "foodChoice/restaurant";
        } else {
            modelMap.put("error", "Invalid UserName / Password");
            return "foodChoice/restaurantLogin";
        }
    }
}
