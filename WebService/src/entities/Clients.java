package entities;

import com.sun.istack.internal.Nullable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serug on 21.05.2017.
 */
@XmlRootElement
public class Clients {

    private List<Client> clients;

    public Clients() {
    }

    public List<Client> getClients() {
        return clients;
    }

    @XmlElement
    public void setClients(List<Client> clients) {
        this.clients = clients;
    }


    @Nullable
    public Client getLast() {
        if(clients == null || clients.size() == 0){
            return null;
        }else {
            return clients.get(clients.size() - 1);
        }
    }

    public void addClient(Client client) {
        if(clients == null){
            clients = new ArrayList<>();
        }
        clients.add(client);
    }
}
