
package br.com.compasso.exemplospringboot.soap.cartaows;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CartaoWSService", targetNamespace = "http://ws.programabolsas.compasso.com.br", wsdlLocation = "\\wsdl")
public class CartaoWSService
    extends Service
{

    private final static URL CARTAOWSSERVICE_WSDL_LOCATION;
    private static URL CARTAOWSSERVICE_WSDL_LOCATION_AUX;
    private final static WebServiceException CARTAOWSSERVICE_EXCEPTION;
    private final static QName CARTAOWSSERVICE_QNAME = new QName("http://ws.programabolsas.compasso.com.br", "CartaoWSService");

    static {
        try {
        	CARTAOWSSERVICE_WSDL_LOCATION_AUX = new URL("http://localhost:8080/WebServicesExercicio/services/CartaoWS?wsdl");
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
        
        CARTAOWSSERVICE_WSDL_LOCATION = CARTAOWSSERVICE_WSDL_LOCATION_AUX;
        
        
        WebServiceException e = null;
        if (CARTAOWSSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find '\\\\wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        CARTAOWSSERVICE_EXCEPTION = e;
    }

    public CartaoWSService() {
        super(__getWsdlLocation(), CARTAOWSSERVICE_QNAME);
    }

    public CartaoWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CARTAOWSSERVICE_QNAME, features);
    }

    public CartaoWSService(URL wsdlLocation) {
        super(wsdlLocation, CARTAOWSSERVICE_QNAME);
    }

    public CartaoWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CARTAOWSSERVICE_QNAME, features);
    }

    public CartaoWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CartaoWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CartaoWS
     */
    @WebEndpoint(name = "CartaoWS")
    public CartaoWS getCartaoWS() {
        return super.getPort(new QName("http://ws.programabolsas.compasso.com.br", "CartaoWS"), CartaoWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CartaoWS
     */
    @WebEndpoint(name = "CartaoWS")
    public CartaoWS getCartaoWS(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.programabolsas.compasso.com.br", "CartaoWS"), CartaoWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CARTAOWSSERVICE_EXCEPTION!= null) {
            throw CARTAOWSSERVICE_EXCEPTION;
        }
        return CARTAOWSSERVICE_WSDL_LOCATION;
    }

}
