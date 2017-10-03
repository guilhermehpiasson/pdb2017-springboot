
package br.com.compasso.exemplospringboot.soap.cartaows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RetornoCartaoDeCredito complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetornoCartaoDeCredito">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valido" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetornoCartaoDeCredito", namespace = "http://model.programabolsas.compasso.com.br", propOrder = {
    "msg",
    "valido"
})
public class RetornoCartaoDeCredito {

    @XmlElement(required = true, nillable = true)
    protected String msg;
    protected boolean valido;

    /**
     * Obtém o valor da propriedade msg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Define o valor da propriedade msg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsg(String value) {
        this.msg = value;
    }

    /**
     * Obtém o valor da propriedade valido.
     * 
     */
    public boolean isValido() {
        return valido;
    }

    /**
     * Define o valor da propriedade valido.
     * 
     */
    public void setValido(boolean value) {
        this.valido = value;
    }

}
