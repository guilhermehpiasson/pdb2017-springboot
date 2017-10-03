
package br.com.compasso.exemplospringboot.soap.cartaows;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.compasso.exemplospringboot.soap.cartaows package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.compasso.exemplospringboot.soap.cartaows
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidaCartaoResponse }
     * 
     */
    public ValidaCartaoResponse createValidaCartaoResponse() {
        return new ValidaCartaoResponse();
    }

    /**
     * Create an instance of {@link RetornoCartaoDeCredito }
     * 
     */
    public RetornoCartaoDeCredito createRetornoCartaoDeCredito() {
        return new RetornoCartaoDeCredito();
    }

    /**
     * Create an instance of {@link ValidaCartao }
     * 
     */
    public ValidaCartao createValidaCartao() {
        return new ValidaCartao();
    }

    /**
     * Create an instance of {@link CartaoDeCredito }
     * 
     */
    public CartaoDeCredito createCartaoDeCredito() {
        return new CartaoDeCredito();
    }

}
