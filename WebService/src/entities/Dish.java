package entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Serug on 30.04.2017.
 */
@XmlRootElement
public class Dish {
    private int id;
    private int cost;
    private String name;

    public Dish() {
    }

    public Dish(int id, int cost, String name) {
        this.id = id;
        this.cost = cost;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    @XmlElement
    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dish that = (Dish) o;

        if (id != that.id) return false;
        if (cost != that.cost) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + cost;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ID: " + id + " Cost: " + cost + " Name: " + name;
    }
}
