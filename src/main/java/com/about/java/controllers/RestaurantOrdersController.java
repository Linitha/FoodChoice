
package com.about.java.controllers;
import com.about.java.entity.Order;
import com.about.java.entity.Restaurant;
import com.about.java.service.FoodOrdersService;
import com.about.java.service.OrderService;
import com.about.java.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
    public class RestaurantOrdersController {
    private FoodOrdersService foodOrdersService;
    private OrderService orderService;

    @Autowired(required=true)
    @Qualifier(value="foodOrdersService")
    public void setMenuService(FoodOrdersService fos){
        this.foodOrdersService = fos;
    }

    @Autowired(required=true)
    @Qualifier(value="orderService")
    public void setMenuService(OrderService os){
        this.orderService = os;
    }

    @RequestMapping(value = "/vieworders/{orderID}", method = RequestMethod.GET)
    public String showOrder(@PathVariable("orderID") String orderID, Model model, HttpServletRequest request) {
        model.addAttribute("listOfFoodOrders", foodOrdersService.getFoodOrders(orderID));
        model.addAttribute("orderID",orderID);
        request.getSession().setAttribute("orderID",orderID);
    return "foodChoice/viewFoodOrders";
    }

    @RequestMapping(value = "/vieworders/deliver", method = RequestMethod.POST)
    public String deliverOrder(Model model, HttpServletRequest request) {
        String orderID = (String)request.getSession().getAttribute("orderID");
        orderService.updateOrder(orderID);
        return "redirect:/restaurant/viewOrders";
    }

}
