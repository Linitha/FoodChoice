
package com.about.java.controllers;
import com.about.java.entity.Restaurant;
import com.about.java.service.FoodOrdersService;
import com.about.java.service.OrderService;
import com.about.java.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
    public class RestaurantOrdersController {
    private FoodOrdersService foodOrdersService;

    @Autowired(required=true)
    @Qualifier(value="foodOrdersService")
    public void setMenuService(FoodOrdersService fos){
        this.foodOrdersService = fos;
    }

    @RequestMapping(value = "/vieworders/{orderID}", method = RequestMethod.GET)
    public String showOrder(@PathVariable("orderID") String orderID, Model model, HttpServletRequest request) {
        model.addAttribute("listOfFoodOrders", foodOrdersService.getFoodOrders(orderID)) ;
    return "foodChoice/viewFoodOrders";
    }


}
