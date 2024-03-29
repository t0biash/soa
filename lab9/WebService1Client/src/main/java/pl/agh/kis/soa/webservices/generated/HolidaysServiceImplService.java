
package pl.agh.kis.soa.webservices.generated;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HolidaysServiceImplService", targetNamespace = "http://implementations.webservices.soa.kis.agh.pl/", wsdlLocation = "http://localhost:8080/HolidaysService?wsdl")
public class HolidaysServiceImplService
    extends Service
{

    private final static URL HOLIDAYSSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException HOLIDAYSSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName HOLIDAYSSERVICEIMPLSERVICE_QNAME = new QName("http://implementations.webservices.soa.kis.agh.pl/", "HolidaysServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/HolidaysService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HOLIDAYSSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        HOLIDAYSSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public HolidaysServiceImplService() {
        super(__getWsdlLocation(), HOLIDAYSSERVICEIMPLSERVICE_QNAME);
    }

    public HolidaysServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HOLIDAYSSERVICEIMPLSERVICE_QNAME, features);
    }

    public HolidaysServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, HOLIDAYSSERVICEIMPLSERVICE_QNAME);
    }

    public HolidaysServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HOLIDAYSSERVICEIMPLSERVICE_QNAME, features);
    }

    public HolidaysServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HolidaysServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HolidaysService
     */
    @WebEndpoint(name = "HolidaysServiceImplPort")
    public HolidaysService getHolidaysServiceImplPort() {
        return super.getPort(new QName("http://implementations.webservices.soa.kis.agh.pl/", "HolidaysServiceImplPort"), HolidaysService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HolidaysService
     */
    @WebEndpoint(name = "HolidaysServiceImplPort")
    public HolidaysService getHolidaysServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://implementations.webservices.soa.kis.agh.pl/", "HolidaysServiceImplPort"), HolidaysService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HOLIDAYSSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw HOLIDAYSSERVICEIMPLSERVICE_EXCEPTION;
        }
        return HOLIDAYSSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
