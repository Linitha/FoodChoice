//package com.about.java.controllers;
//
//import com.about.java.entity.Restaurant;
//import com.about.java.service.OrderService;
//import com.about.java.service.RestaurantService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.servlet.http.HttpServletRequest;
//
//@Controller
//    public class RestaurantOrdersController {
//    private OrderService orderService;
//
//    @Autowired(required=true)
//    @Qualifier(value="orderService")
//    public void setMenuService(OrderService os){
//        this.orderService = os;
//    }
//
//    @RequestMapping(value = "/vieworders", method = RequestMethod.GET)
//    public String displayOrders(Model model, HttpServletRequest request) {
//        Restaurant restaurant = (Restaurant) request.getSession().getAttribute("loggedInRestaurant");
//        System.out.println(restaurant.getRestaurantName());
//        model.addAttribute("listOfOrders", orderService.getOrders(restaurant.getRestaurantID()));
//    return "foodchoice/vieworders";
//    }
//
//
//}
