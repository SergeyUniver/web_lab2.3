import javax.ejb.Remote;

/**
 * Created by Serug on 14.05.2017.
 */
@Remote
public interface SessionRemote {

    String getResult();

}
