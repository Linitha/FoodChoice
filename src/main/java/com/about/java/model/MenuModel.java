package com.about.java.model;


import org.springframework.web.servlet.ModelAndView;
import repository.FoodChoiceRepository;

public class MenuModel {
    public ModelAndView getMenu(String restaurantName,ModelAndView mav) {
        FoodChoiceRepository foodChoiceRepository = new FoodChoiceRepository();
        mav.addObject("listOfItems", foodChoiceRepository.getMenuItems(restaurantName));

    return mav;
    }

}
