package premierwebserviceclass;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-02-09T11:06:56.181+01:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "MyServiceImplService", 
                  wsdlLocation = "http://localhost:8080/WebServiceProject/services/MyServiceImplPort?wsdl",
                  targetNamespace = "http://premierWebServiceClass/") 
public class MyServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://premierWebServiceClass/", "MyServiceImplService");
    public final static QName MyServiceImplPort = new QName("http://premierWebServiceClass/", "MyServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/WebServiceProject/services/MyServiceImplPort?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MyServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/WebServiceProject/services/MyServiceImplPort?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MyServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MyServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MyServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public MyServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public MyServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public MyServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns MyServiceImpl
     */
    @WebEndpoint(name = "MyServiceImplPort")
    public MyServiceImpl getMyServiceImplPort() {
        return super.getPort(MyServiceImplPort, MyServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MyServiceImpl
     */
    @WebEndpoint(name = "MyServiceImplPort")
    public MyServiceImpl getMyServiceImplPort(WebServiceFeature... features) {
        return super.getPort(MyServiceImplPort, MyServiceImpl.class, features);
    }

}
