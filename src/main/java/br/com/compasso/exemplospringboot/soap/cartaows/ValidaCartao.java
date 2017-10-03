
package br.com.compasso.exemplospringboot.soap.cartaows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cartaoDeCredito" type="{http://model.programabolsas.compasso.com.br}CartaoDeCredito"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cartaoDeCredito"
})
@XmlRootElement(name = "validaCartao")
public class ValidaCartao {

    @XmlElement(required = true)
    protected CartaoDeCredito cartaoDeCredito;

    /**
     * Obtém o valor da propriedade cartaoDeCredito.
     * 
     * @return
     *     possible object is
     *     {@link CartaoDeCredito }
     *     
     */
    public CartaoDeCredito getCartaoDeCredito() {
        return cartaoDeCredito;
    }

    /**
     * Define o valor da propriedade cartaoDeCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link CartaoDeCredito }
     *     
     */
    public void setCartaoDeCredito(CartaoDeCredito value) {
        this.cartaoDeCredito = value;
    }

}
