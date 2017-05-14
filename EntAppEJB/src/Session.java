import javax.ejb.Stateless;

/**
 * Created by Serug on 14.05.2017.
 */
@Stateless
public class Session implements SessionRemote{
    @Override
    public String getResult() {
        return "Hello, world!";
    }
}
