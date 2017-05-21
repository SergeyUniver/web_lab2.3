package web;

import entities.*;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serug on 21.05.2017.
 */
@WebService
public class SimpleWebService {
    private static final String ORDERS_FILE_NAME = "orders.xml";
    private static final String CLIENT_FILE_NAME = "clients.xml";
    private static final String DISH_FILE_NAME = "dishes.xml";

    @WebMethod
    public void inintRecord(){
        Clients clients = new Clients();
        clients.addClient(new Client(0, "Igor"));
        clients.addClient(new Client(1, "Sergey"));
        clients.addClient(new Client(2, "Olga"));
        clients.addClient(new Client(3, "Svetlana"));
        clients.addClient(new Client(4, "James"));
        new RequestHelper<Clients>(Clients.class, CLIENT_FILE_NAME).saveEintity(clients);

        Dishes dishes = new Dishes();
        dishes.addDish(new Dish(0, 100, "Dish1"));
        dishes.addDish(new Dish(1, 500, "Dish2"));
        dishes.addDish(new Dish(2, 250, "Dish3"));
        dishes.addDish(new Dish(3, 1900, "Dish4"));
        new RequestHelper<Dishes>(Dishes.class, DISH_FILE_NAME).saveEintity(dishes);

        Orders orders = new Orders();
        orders.addOrder(new Order(0, 20, false, false, dishes.getDishes().get(0), clients.getClients().get(1)), false);
        orders.addOrder(new Order(1, 1, true, false, dishes.getDishes().get(1), clients.getClients().get(2)), false);
        orders.addOrder(new Order(2, 4, false, true, dishes.getDishes().get(3), clients.getClients().get(2)), false);
        orders.addOrder(new Order(3, 2, true, true, dishes.getDishes().get(2), clients.getClients().get(0)), false);
        new RequestHelper<Orders>(Orders.class, ORDERS_FILE_NAME).saveEintity(orders);

    }

    @WebMethod
    public List<String> getAllOrders() {
        Orders orders = new RequestHelper<Orders>(Orders.class, ORDERS_FILE_NAME).getEntity();
        List<String> result = new ArrayList<>();
        for(Order order : orders.getOrders()){
            result.add(order.toString());
        }
        return result;
    }

    @WebMethod
    public List<String> getAllOrdersForClient(int clientId) {

        Orders orders = new RequestHelper<Orders>(Orders.class, ORDERS_FILE_NAME).getEntity();
        List<String> result = new ArrayList<>();
        for(Order order : orders.getOrders()){
            if(clientId == order.getClient().getId()){
                result.add(order.toString());
            }
        }
        return result;
    }

    @WebMethod
    public List<String> getAllClients() {
        Clients clients = new RequestHelper<Clients>(Clients.class, CLIENT_FILE_NAME).getEntity();
        List<String> result = new ArrayList<>();
        for(Client client : clients.getClients()){
                result.add(client.toString());
        }
        return result;
    }

    @WebMethod
    public List<String> getAllDishes() {
        Dishes dishes = new RequestHelper<Dishes>(Dishes.class, DISH_FILE_NAME).getEntity();
        List<String> result = new ArrayList<>();
        for(Dish dish : dishes.getDishes()){
            result.add(dish.toString());
        }
        return result;
    }

    @WebMethod
    public List<String> getAcceptedOrders() {
        Orders orders = new RequestHelper<Orders>(Orders.class, ORDERS_FILE_NAME).getEntity();
        List<String> result = new ArrayList<>();
        for(Order order : orders.getOrders()){
            if(order.isAccepted()){
                result.add(order.toString());
            }
        }
        return result;
    }

    @WebMethod
    public void makeOrder(int dishId, int count, boolean isPayed) {
        Orders orders = new RequestHelper<Orders>(Orders.class, ORDERS_FILE_NAME).getEntity();

        Order order = new Order();
        order.setClient(getLastClient());
        order.setDish(getDish(dishId));
        order.setPayed(isPayed);
        order.setDishCount(count);
        orders.addOrder(order, true);

    }

    private Client getLastClient() {
        Clients clients = new RequestHelper<Clients>(Clients.class, CLIENT_FILE_NAME).getEntity();
        if(clients == null || clients.getClients() == null || clients.getClients().size() == 0){
            return null;
        }
        return clients.getLast();
    }

    private Dish getDish(int dishId) {
        Dishes dishes = new RequestHelper<Dishes>(Dishes.class, DISH_FILE_NAME).getEntity();
        for(Dish dish : dishes.getDishes()){
            if(dish.getId() == dishId){
                return dish;
            }
        }
        return null;
    }

}
