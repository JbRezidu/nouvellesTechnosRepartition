
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package premierwebserviceclass;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-02-09T11:06:56.155+01:00
 * Generated source version: 3.1.10
 * 
 */

@javax.jws.WebService(
                      serviceName = "MyServiceImplService",
                      portName = "MyServiceImplPort",
                      targetNamespace = "http://premierWebServiceClass/",
                      wsdlLocation = "http://localhost:8080/WebServiceProject/services/MyServiceImplPort?wsdl",
                      endpointInterface = "premierwebserviceclass.MyServiceImpl")
                      
public class MyServiceImplPortImpl implements MyServiceImpl {

    private static final Logger LOG = Logger.getLogger(MyServiceImplPortImpl.class.getName());

    /* (non-Javadoc)
     * @see premierwebserviceclass.MyServiceImpl#ajoute(int arg0, int arg1)*
     */
    public int ajoute(int arg0, int arg1) { 
        LOG.info("Executing operation ajoute");
        System.out.println(arg0);
        System.out.println(arg1);
        try {
            int _return = -1738046854;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see premierwebserviceclass.MyServiceImpl#recupereList(java.lang.String arg0, java.lang.String arg1)*
     */
    public java.util.List<java.lang.String> recupereList(java.lang.String arg0, java.lang.String arg1) { 
        LOG.info("Executing operation recupereList");
        System.out.println(arg0);
        System.out.println(arg1);
        try {
            java.util.List<java.lang.String> _return = new java.util.ArrayList<java.lang.String>();
            java.lang.String _returnVal1 = "_returnVal-1362102023";
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
