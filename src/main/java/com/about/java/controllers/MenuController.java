package com.about.java.controllers;


import com.about.java.entity.Menu;
import com.about.java.model.MenuModel;
import com.about.java.model.Order;
import com.about.java.model.PaymentModel;
import com.about.java.model.RestaurantModel;
import com.about.java.service.MenuService;
import com.about.java.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes({"restaurantID"})
public class MenuController {
    private MenuService menuService;
    private OrderService orderService;

    @Autowired(required=true)
    @Qualifier(value="menuService")
    public void setMenuService(MenuService ms){
        this.menuService = ms;
    }
    @Autowired(required=true)
    @Qualifier(value="orderService")
    public void setMenuService(OrderService os){
        this.orderService = os;
    }
    @RequestMapping(value = "/restaurant/{restaurantID}", method = RequestMethod.GET)

    public ModelAndView showMenu(@PathVariable("restaurantID") String restaurantID,Model model,HttpServletRequest request) {
        request.getSession().setAttribute("restaurantID", restaurantID);
        model.addAttribute("restaurantId", restaurantID);
        ModelAndView mav = new ModelAndView("foodChoice/menu");
        List<Menu> menuItems = menuService.listMenuItems(restaurantID);
        Order order = new Order();
        order.setItems(menuItems);
        request.getSession().setAttribute("menuItems",menuItems);
        mav.addObject("order", order);
        return mav;
    }

    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public ModelAndView submitForm(@RequestParam("selectedItems") ArrayList<String> selectedItems, HttpServletRequest request) {
        String restaurantID = (String)request.getSession().getAttribute("restaurantID");
        ArrayList<Menu> allMenuItems= (ArrayList<Menu>) request.getSession().getAttribute("menuItems");
        ArrayList<Menu> selectedMenuItems= new ArrayList<Menu>();
//
        for(Menu menu: allMenuItems )
        {
            for(String id : selectedItems)
            {
                if(menu.getItemID().equals(id))
                {
                    selectedMenuItems.add(menu);
                }
            }
        }
        orderService.createOrder(selectedMenuItems,restaurantID);
        System.out.println(restaurantID);
        ModelAndView mav = new ModelAndView("foodChoice/payment");
        mav.addObject("payment", new PaymentModel());
        return mav;
}

}
