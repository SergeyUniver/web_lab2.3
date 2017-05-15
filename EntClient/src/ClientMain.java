import javax.ejb.EJB;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Serug on 14.05.2017.
 */
public class ClientMain {

    private static final String MENU_FILE = "menu.txt";

    @EJB
    private static SessionRemote session;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        while (exit != true) {
            System.out.println(getMenuText());
            switch (in.nextInt()) {
                case 1: {
                    showAllOrdersByClient(in);
                    break;
                }
                case 2: {
                    showAllDishes();
                    break;
                }
                case 3: {
                    showAcceptedOrders();
                    break;
                }
                case 4: {
                    makeOrder(in);
                    break;
                }
                case 0: {
                    exit = true;
                    break;
                }
                default: {
                    System.out.println("Wrong input!");
                }
            }
        }
    }

    private static void makeOrder(Scanner in) {
        System.out.println("Select dish id: ");
        int dishId = in.nextInt();
        System.out.println("Select count: ");
        int count = in.nextInt();
        System.out.println("Would you like pay?: (1 - yes, 0 - no) ");
        boolean isPayed = in.nextInt() == 1;
        session.makeOrder(dishId, count, isPayed);
        System.out.println("Done!");
    }

    private static void showAcceptedOrders() {
        showAll(session.getAcceptedOrders());
    }

    private static void showAllDishes() {
        showAll(session.getAllDishes());
    }

    private static void showAllOrdersByClient(Scanner in) {
        showAll(session.getAllClients());
        int id = in.nextInt();
        showAll(session.getAllOrders(id));
    }

    private static void showAll(List<String> lines) {
        for (String line : lines){
            System.out.println(line);
        }
    }

    private static String getMenuText() {
        String menuString = "";
        try {
            Scanner menu = new Scanner(new FileInputStream(MENU_FILE));
        while (menu.hasNextLine())
            menuString += menu.nextLine() + "\n";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return menuString;
    }


}
