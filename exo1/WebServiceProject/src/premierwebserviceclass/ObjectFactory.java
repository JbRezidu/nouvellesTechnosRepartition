
package premierwebserviceclass;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the premierwebserviceclass package. 
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

    private final static QName _Ajoute_QNAME = new QName("http://premierWebServiceClass/", "ajoute");
    private final static QName _AjouteResponse_QNAME = new QName("http://premierWebServiceClass/", "ajouteResponse");
    private final static QName _RecupereList_QNAME = new QName("http://premierWebServiceClass/", "recupereList");
    private final static QName _RecupereListResponse_QNAME = new QName("http://premierWebServiceClass/", "recupereListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: premierwebserviceclass
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Ajoute }
     * 
     */
    public Ajoute createAjoute() {
        return new Ajoute();
    }

    /**
     * Create an instance of {@link AjouteResponse }
     * 
     */
    public AjouteResponse createAjouteResponse() {
        return new AjouteResponse();
    }

    /**
     * Create an instance of {@link RecupereList }
     * 
     */
    public RecupereList createRecupereList() {
        return new RecupereList();
    }

    /**
     * Create an instance of {@link RecupereListResponse }
     * 
     */
    public RecupereListResponse createRecupereListResponse() {
        return new RecupereListResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ajoute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://premierWebServiceClass/", name = "ajoute")
    public JAXBElement<Ajoute> createAjoute(Ajoute value) {
        return new JAXBElement<Ajoute>(_Ajoute_QNAME, Ajoute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://premierWebServiceClass/", name = "ajouteResponse")
    public JAXBElement<AjouteResponse> createAjouteResponse(AjouteResponse value) {
        return new JAXBElement<AjouteResponse>(_AjouteResponse_QNAME, AjouteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecupereList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://premierWebServiceClass/", name = "recupereList")
    public JAXBElement<RecupereList> createRecupereList(RecupereList value) {
        return new JAXBElement<RecupereList>(_RecupereList_QNAME, RecupereList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecupereListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://premierWebServiceClass/", name = "recupereListResponse")
    public JAXBElement<RecupereListResponse> createRecupereListResponse(RecupereListResponse value) {
        return new JAXBElement<RecupereListResponse>(_RecupereListResponse_QNAME, RecupereListResponse.class, null, value);
    }

}
