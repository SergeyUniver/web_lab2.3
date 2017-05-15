import dao.ClientDAO;
import dao.DAOException;
import dao.DishDAO;
import dao.OrderDAO;
import entities.Client;
import entities.Dish;
import entities.Order;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serug on 14.05.2017.
 */
@Stateless
public class Session implements SessionRemote{
    @EJB
    private DishDAO dishDAO;
    @EJB
    private ClientDAO clientDAO;
    @EJB
    private OrderDAO orderDAO;

    @Override
    public List<String> getAllOrders(int clientId) {
        List<String> result = new ArrayList<>();
        try {
            List<Order> orders = orderDAO.showOrdersByClient(clientId);
            for(Order order : orders){
                result.add(order.toString());
            }
        }catch (DAOException e){
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<String> getAllClients() {
        List<String> result = new ArrayList<>();
        try {
            List<Client> clients = clientDAO.getAllClient();
            for(Client client : clients){
                result.add(client.toString());
            }
        }catch (DAOException e){
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<String> getAllDishes() {
        List<String> result = new ArrayList<>();
        try {
            List<Dish> dishes = dishDAO.getAllDishes();
            for(Dish dish : dishes){
                result.add(dish.toString());
            }
        }catch (DAOException e){
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<String> getAcceptedOrders() {
        List<String> result = new ArrayList<>();
        try {
            List<Order> orders = orderDAO.getAcceptedOrders();
            for(Order order : orders){
                result.add(order.toString());
            }
        }catch (DAOException e){
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public void makeOrder(int dishId, int count, boolean isPayed) {
        try {
            orderDAO.makeOrder(dishId, count, isPayed, false, dishDAO, clientDAO);
        } catch (DAOException e) {
            e.printStackTrace();
        }
    }


}
