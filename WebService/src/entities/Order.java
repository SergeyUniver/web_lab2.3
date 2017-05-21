package entities;

import com.sun.xml.internal.txw2.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Created by Serug on 30.04.2017.
 */
@XmlRootElement
public class Order {
    private int id;
    private Integer dishCount;
    private boolean isAccepted;
    private boolean isPayed;
    private Dish dish;
    private Client client;

    public Order() {
    }

    public Order(int id, Integer dishCount, boolean isAccepted, boolean isPayed, Dish dish, Client client) {
        this.id = id;
        this.dishCount = dishCount;
        this.isAccepted = isAccepted;
        this.isPayed = isPayed;
        this.dish = dish;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public Integer getDishCount() {
        return dishCount;
    }

    @XmlElement
    public void setDishCount(Integer dishCount) {
        this.dishCount = dishCount;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    @XmlElement
    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @XmlElement
    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    public Dish getDish() {
        return dish;
    }

    @XmlElement
    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public Client getClient() {
        return client;
    }

    @XmlElement
    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nDish:\n" + dish.toString() +
                "\nCount: " + dishCount +
                "\nClient:\n" + client.toString() +
                "\nIsAccepted: " + String.valueOf(isAccepted) +
                " IsPayed: " + String.valueOf(isPayed);
    }
}
