
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
 *         &lt;element name="validaCartaoReturn" type="{http://model.programabolsas.compasso.com.br}RetornoCartaoDeCredito"/>
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
    "validaCartaoReturn"
})
@XmlRootElement(name = "validaCartaoResponse")
public class ValidaCartaoResponse {

    @XmlElement(required = true)
    protected RetornoCartaoDeCredito validaCartaoReturn;

    /**
     * Obtém o valor da propriedade validaCartaoReturn.
     * 
     * @return
     *     possible object is
     *     {@link RetornoCartaoDeCredito }
     *     
     */
    public RetornoCartaoDeCredito getValidaCartaoReturn() {
        return validaCartaoReturn;
    }

    /**
     * Define o valor da propriedade validaCartaoReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link RetornoCartaoDeCredito }
     *     
     */
    public void setValidaCartaoReturn(RetornoCartaoDeCredito value) {
        this.validaCartaoReturn = value;
    }

}
