package repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

@Getter
@Setter
@AllArgsConstructor
public class Restaurant {
    private String name;
    private List<MenuItem> menuItems = newArrayList();
}
