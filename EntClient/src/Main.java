import javax.ejb.EJB;

/**
 * Created by Serug on 14.05.2017.
 */
public class Main {

    @EJB
    private static SessionRemote mySession;

    public static void main(String[] args) {
        System.out.println(mySession.getResult());
    }


}
