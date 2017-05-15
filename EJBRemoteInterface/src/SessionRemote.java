import javax.ejb.Remote;
import java.util.List;

/**
 * Created by Serug on 14.05.2017.
 */
@Remote
public interface SessionRemote {

    List<String> getAllOrders(int clientId);
    List<String> getAllClients();
    List<String> getAllDishes();
    List<String> getAcceptedOrders();
    void makeOrder(int dishId, int count, boolean isPayed);


}
