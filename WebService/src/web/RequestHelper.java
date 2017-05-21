package web;

import com.sun.istack.internal.Nullable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by Serug on 21.05.2017.
 */
public class RequestHelper<T> {

    private final Class mClass;
    private final String fileName;

    public RequestHelper(Class mClass, String fileName){
        this.mClass = mClass;
        this.fileName = fileName;
    }

    @Nullable
    public T getEntity(){
        T result = null;
        try {

            File file = new File(fileName);
            JAXBContext jaxbContext = JAXBContext.newInstance(mClass);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            result = (T) jaxbUnmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void saveEintity(T entity){
        try {

            File file = new File(fileName);
            JAXBContext jaxbContext = JAXBContext.newInstance(mClass);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(entity, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
