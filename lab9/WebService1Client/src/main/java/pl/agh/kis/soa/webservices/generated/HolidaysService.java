
package pl.agh.kis.soa.webservices.generated;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HolidaysService", targetNamespace = "http://interfaces.webservices.soa.kis.agh.pl/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HolidaysService {


    /**
     * 
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "daysToHolidays", targetNamespace = "http://interfaces.webservices.soa.kis.agh.pl/", className = "pl.agh.kis.soa.webservices.generated.DaysToHolidays")
    @ResponseWrapper(localName = "daysToHolidaysResponse", targetNamespace = "http://interfaces.webservices.soa.kis.agh.pl/", className = "pl.agh.kis.soa.webservices.generated.DaysToHolidaysResponse")
    @Action(input = "http://interfaces.webservices.soa.kis.agh.pl/HolidaysService/daysToHolidaysRequest", output = "http://interfaces.webservices.soa.kis.agh.pl/HolidaysService/daysToHolidaysResponse")
    public long daysToHolidays();

}
