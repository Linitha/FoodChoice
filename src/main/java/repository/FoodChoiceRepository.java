package repository;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

@Getter
@Setter
public class FoodChoiceRepository {
    private List<Restaurant> restaurants = newArrayList();

    public FoodChoiceRepository() {
        MenuItem pasta = new MenuItem("Pasta", 10D);
        MenuItem macAndCheese = new MenuItem("Mac n Cheese", 8D);
        Restaurant linithasKitchen = new Restaurant("Linitha Kitchen",
                newArrayList(macAndCheese, pasta));
        MenuItem chickenBiryani = new MenuItem("Chicken Biryani", 11.9D);
        MenuItem mutterPaneer = new MenuItem("Mutter Paneer", 9.99D);
        Restaurant tasteOfIndia = new Restaurant("Taste Of India",
                newArrayList(chickenBiryani, mutterPaneer));
        restaurants = newArrayList(linithasKitchen,tasteOfIndia);
    }
public List<String> getRestaurantList()
{
    List<String> restaurantNames= new ArrayList<String>();
    for(int i = 0; i < restaurants.size(); i++) {
        restaurantNames.add(restaurants.get(i).getName());
    }
    return restaurantNames;

}
    public List<MenuItem> getMenuItems(String restaurantName)
    {
        List<MenuItem> menuItems = new ArrayList<MenuItem>();

        for (Restaurant restaurant : restaurants) {
            if(restaurant.getName().equals(restaurantName))
            {
             menuItems = restaurant.getMenuItems();
            }
        }
      return menuItems;
    }
}
