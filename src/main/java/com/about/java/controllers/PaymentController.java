package com.about.java.controllers;

import com.about.java.model.PaymentModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PaymentController {
    @RequestMapping(value = "/payment", method = RequestMethod.POST)
    public ModelAndView makePayment(@ModelAttribute PaymentModel paymentModel, Model model) {
        ModelAndView mav = new ModelAndView("foodChoice/orderConfirmation");
        return mav;
    }
}
