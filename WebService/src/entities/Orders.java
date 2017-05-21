package entities;

import com.sun.istack.internal.Nullable;
import com.sun.org.apache.xpath.internal.operations.Or;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serug on 21.05.2017.
 */
@XmlRootElement
public class Orders {

    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    @XmlElement
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(Order order, boolean addId) {
        if(addId) {
            int id = 0;
            Order last = getLast();
            if (last != null) {
                id = last.getId();
                id++;
            }
            order.setId(id);
        }
        if(orders == null){
            orders = new ArrayList<>();
        }
        orders.add(order);
    }

    @Nullable
    public Order getLast() {
        if(orders == null || orders.size() == 0){
            return null;
        }else {
            return orders.get(orders.size() - 1);
        }
    }
}
