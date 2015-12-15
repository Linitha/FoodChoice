package com.about.java.model;

import org.springframework.web.servlet.ModelAndView;
import repository.FoodChoiceRepository;

import java.util.ArrayList;
import java.util.List;


public class RestaurantModel {
   public ModelAndView getRestaurants(ModelAndView mav){
       FoodChoiceRepository foodChoiceRepository = new FoodChoiceRepository();
       mav.addObject("listOfRestaurant", foodChoiceRepository.getRestaurantList());
       return(mav);

    }
}
