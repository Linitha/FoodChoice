package com.about.java.controllers;



import com.about.java.model.LoginModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String init(ModelMap modelMap) {
        modelMap.put("info", "Hello User");
        return "foodChoice/login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String submit(ModelMap modelMap, @ModelAttribute("loginModel")  LoginModel loginModel) {
        System.out.println("in submit" + loginModel);
        String password = loginModel.getPassword();
        if (password != null && password.equals("onlinetutorialspoint")) {
            modelMap.put("userInfo", loginModel.getUserName());
            return "foodChoice/restaurant";
        } else {
            modelMap.put("error", "Invalid UserName / Password");
            return "foodChoice/login";
        }

    }
}