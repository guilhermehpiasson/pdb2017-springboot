
package br.com.compasso.exemplospringboot.soap.cartaows;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CartaoWS", targetNamespace = "http://ws.programabolsas.compasso.com.br")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CartaoWS {


    /**
     * 
     * @param cartaoDeCredito
     * @return
     *     returns br.com.compasso.exemplospringboot.soap.cartaows.RetornoCartaoDeCredito
     */
    @WebMethod
    @WebResult(name = "validaCartaoReturn", targetNamespace = "http://ws.programabolsas.compasso.com.br")
    @RequestWrapper(localName = "validaCartao", targetNamespace = "http://ws.programabolsas.compasso.com.br", className = "br.com.compasso.exemplospringboot.soap.cartaows.ValidaCartao")
    @ResponseWrapper(localName = "validaCartaoResponse", targetNamespace = "http://ws.programabolsas.compasso.com.br", className = "br.com.compasso.exemplospringboot.soap.cartaows.ValidaCartaoResponse")
    public RetornoCartaoDeCredito validaCartao(
        @WebParam(name = "cartaoDeCredito", targetNamespace = "http://ws.programabolsas.compasso.com.br")
        CartaoDeCredito cartaoDeCredito);

}
