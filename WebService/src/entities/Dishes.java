package entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serug on 21.05.2017.
 */
@XmlRootElement
public class Dishes {

    private List<Dish> dishes;

    public Dishes() {
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    @XmlElement
    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public void addDish(Dish dish) {
        if(dishes == null){
            dishes = new ArrayList<>();
        }
        dishes.add(dish);
    }
}
