package com.about.java.controllers;


import com.about.java.entity.Customer;
import com.about.java.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping(value = "/register")
public class RegistrationController {
    @Autowired
    private CustomerService customerService;

    @Autowired(required=true)
    @Qualifier(value= "customerService")
    public void setCustomerService(CustomerService cs){
        this.customerService = cs;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String viewRegistration(Model model) {
        model.addAttribute("customer", new Customer());
        return "foodChoice/registration";
    }
    //For add and update person both
    @RequestMapping(method = RequestMethod.POST)
    public String addCustomer(@ModelAttribute("customer") Customer c,Map<String, Object> model){
        System.out.println(c.getCustomerId());
        System.out.println(c.getFirstName());
        System.out.println(c.getLastName());
        System.out.println(c.getPassword());
        this.customerService.addCustomer(c);
        return "foodChoice/RegistrationSuccess";
    }



}
