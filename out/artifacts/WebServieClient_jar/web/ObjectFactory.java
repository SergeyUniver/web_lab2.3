
package web;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the web package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAcceptedOrders_QNAME = new QName("http://web/", "getAcceptedOrders");
    private final static QName _GetAcceptedOrdersResponse_QNAME = new QName("http://web/", "getAcceptedOrdersResponse");
    private final static QName _GetAllClients_QNAME = new QName("http://web/", "getAllClients");
    private final static QName _GetAllClientsResponse_QNAME = new QName("http://web/", "getAllClientsResponse");
    private final static QName _GetAllDishes_QNAME = new QName("http://web/", "getAllDishes");
    private final static QName _GetAllDishesResponse_QNAME = new QName("http://web/", "getAllDishesResponse");
    private final static QName _GetAllOrders_QNAME = new QName("http://web/", "getAllOrders");
    private final static QName _GetAllOrdersForClient_QNAME = new QName("http://web/", "getAllOrdersForClient");
    private final static QName _GetAllOrdersForClientResponse_QNAME = new QName("http://web/", "getAllOrdersForClientResponse");
    private final static QName _GetAllOrdersResponse_QNAME = new QName("http://web/", "getAllOrdersResponse");
    private final static QName _InintRecord_QNAME = new QName("http://web/", "inintRecord");
    private final static QName _InintRecordResponse_QNAME = new QName("http://web/", "inintRecordResponse");
    private final static QName _MakeOrder_QNAME = new QName("http://web/", "makeOrder");
    private final static QName _MakeOrderResponse_QNAME = new QName("http://web/", "makeOrderResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: web
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAcceptedOrders }
     * 
     */
    public GetAcceptedOrders createGetAcceptedOrders() {
        return new GetAcceptedOrders();
    }

    /**
     * Create an instance of {@link GetAcceptedOrdersResponse }
     * 
     */
    public GetAcceptedOrdersResponse createGetAcceptedOrdersResponse() {
        return new GetAcceptedOrdersResponse();
    }

    /**
     * Create an instance of {@link GetAllClients }
     * 
     */
    public GetAllClients createGetAllClients() {
        return new GetAllClients();
    }

    /**
     * Create an instance of {@link GetAllClientsResponse }
     * 
     */
    public GetAllClientsResponse createGetAllClientsResponse() {
        return new GetAllClientsResponse();
    }

    /**
     * Create an instance of {@link GetAllDishes }
     * 
     */
    public GetAllDishes createGetAllDishes() {
        return new GetAllDishes();
    }

    /**
     * Create an instance of {@link GetAllDishesResponse }
     * 
     */
    public GetAllDishesResponse createGetAllDishesResponse() {
        return new GetAllDishesResponse();
    }

    /**
     * Create an instance of {@link GetAllOrders }
     * 
     */
    public GetAllOrders createGetAllOrders() {
        return new GetAllOrders();
    }

    /**
     * Create an instance of {@link GetAllOrdersForClient }
     * 
     */
    public GetAllOrdersForClient createGetAllOrdersForClient() {
        return new GetAllOrdersForClient();
    }

    /**
     * Create an instance of {@link GetAllOrdersForClientResponse }
     * 
     */
    public GetAllOrdersForClientResponse createGetAllOrdersForClientResponse() {
        return new GetAllOrdersForClientResponse();
    }

    /**
     * Create an instance of {@link GetAllOrdersResponse }
     * 
     */
    public GetAllOrdersResponse createGetAllOrdersResponse() {
        return new GetAllOrdersResponse();
    }

    /**
     * Create an instance of {@link InintRecord }
     * 
     */
    public InintRecord createInintRecord() {
        return new InintRecord();
    }

    /**
     * Create an instance of {@link InintRecordResponse }
     * 
     */
    public InintRecordResponse createInintRecordResponse() {
        return new InintRecordResponse();
    }

    /**
     * Create an instance of {@link MakeOrder }
     * 
     */
    public MakeOrder createMakeOrder() {
        return new MakeOrder();
    }

    /**
     * Create an instance of {@link MakeOrderResponse }
     * 
     */
    public MakeOrderResponse createMakeOrderResponse() {
        return new MakeOrderResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAcceptedOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web/", name = "getAcceptedOrders")
    public JAXBElement<GetAcceptedOrders> createGetAcceptedOrders(GetAcceptedOrders value) {
        return new JAXBElement<GetAcceptedOrders>(_GetAcceptedOrders_QNAME, GetAcceptedOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAcceptedOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web/", name = "getAcceptedOrdersResponse")
    public JAXBElement<GetAcceptedOrdersResponse> createGetAcceptedOrdersResponse(GetAcceptedOrdersResponse value) {
        return new JAXBElement<GetAcceptedOrdersResponse>(_GetAcceptedOrdersResponse_QNAME, GetAcceptedOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllClients }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web/", name = "getAllClients")
    public JAXBElement<GetAllClients> createGetAllClients(GetAllClients value) {
        return new JAXBElement<GetAllClients>(_GetAllClients_QNAME, GetAllClients.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllClientsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web/", name = "getAllClientsResponse")
    public JAXBElement<GetAllClientsResponse> createGetAllClientsResponse(GetAllClientsResponse value) {
        return new JAXBElement<GetAllClientsResponse>(_GetAllClientsResponse_QNAME, GetAllClientsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDishes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web/", name = "getAllDishes")
    public JAXBElement<GetAllDishes> createGetAllDishes(GetAllDishes value) {
        return new JAXBElement<GetAllDishes>(_GetAllDishes_QNAME, GetAllDishes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDishesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web/", name = "getAllDishesResponse")
    public JAXBElement<GetAllDishesResponse> createGetAllDishesResponse(GetAllDishesResponse value) {
        return new JAXBElement<GetAllDishesResponse>(_GetAllDishesResponse_QNAME, GetAllDishesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web/", name = "getAllOrders")
    public JAXBElement<GetAllOrders> createGetAllOrders(GetAllOrders value) {
        return new JAXBElement<GetAllOrders>(_GetAllOrders_QNAME, GetAllOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrdersForClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web/", name = "getAllOrdersForClient")
    public JAXBElement<GetAllOrdersForClient> createGetAllOrdersForClient(GetAllOrdersForClient value) {
        return new JAXBElement<GetAllOrdersForClient>(_GetAllOrdersForClient_QNAME, GetAllOrdersForClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrdersForClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web/", name = "getAllOrdersForClientResponse")
    public JAXBElement<GetAllOrdersForClientResponse> createGetAllOrdersForClientResponse(GetAllOrdersForClientResponse value) {
        return new JAXBElement<GetAllOrdersForClientResponse>(_GetAllOrdersForClientResponse_QNAME, GetAllOrdersForClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web/", name = "getAllOrdersResponse")
    public JAXBElement<GetAllOrdersResponse> createGetAllOrdersResponse(GetAllOrdersResponse value) {
        return new JAXBElement<GetAllOrdersResponse>(_GetAllOrdersResponse_QNAME, GetAllOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InintRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web/", name = "inintRecord")
    public JAXBElement<InintRecord> createInintRecord(InintRecord value) {
        return new JAXBElement<InintRecord>(_InintRecord_QNAME, InintRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InintRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web/", name = "inintRecordResponse")
    public JAXBElement<InintRecordResponse> createInintRecordResponse(InintRecordResponse value) {
        return new JAXBElement<InintRecordResponse>(_InintRecordResponse_QNAME, InintRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web/", name = "makeOrder")
    public JAXBElement<MakeOrder> createMakeOrder(MakeOrder value) {
        return new JAXBElement<MakeOrder>(_MakeOrder_QNAME, MakeOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web/", name = "makeOrderResponse")
    public JAXBElement<MakeOrderResponse> createMakeOrderResponse(MakeOrderResponse value) {
        return new JAXBElement<MakeOrderResponse>(_MakeOrderResponse_QNAME, MakeOrderResponse.class, null, value);
    }

}
