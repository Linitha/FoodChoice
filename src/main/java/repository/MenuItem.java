package repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuItem {
    private String name;
    private double price;
    private boolean selected;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
