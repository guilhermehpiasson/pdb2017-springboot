
package br.com.compasso.exemplospringboot.soap.cartaows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CartaoDeCredito complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CartaoDeCredito">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bandeira" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoVerificador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtValidade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nomeTitular" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nroCartao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CartaoDeCredito", namespace = "http://model.programabolsas.compasso.com.br", propOrder = {
    "bandeira",
    "codigoVerificador",
    "dtValidade",
    "nomeTitular",
    "nroCartao"
})
public class CartaoDeCredito {

    @XmlElement(required = true, nillable = true)
    protected String bandeira;
    @XmlElement(required = true, nillable = true)
    protected String codigoVerificador;
    @XmlElement(required = true, nillable = true)
    protected String dtValidade;
    @XmlElement(required = true, nillable = true)
    protected String nomeTitular;
    @XmlElement(required = true, nillable = true)
    protected String nroCartao;

    /**
     * Obtém o valor da propriedade bandeira.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandeira() {
        return bandeira;
    }

    /**
     * Define o valor da propriedade bandeira.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandeira(String value) {
        this.bandeira = value;
    }

    /**
     * Obtém o valor da propriedade codigoVerificador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoVerificador() {
        return codigoVerificador;
    }

    /**
     * Define o valor da propriedade codigoVerificador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoVerificador(String value) {
        this.codigoVerificador = value;
    }

    /**
     * Obtém o valor da propriedade dtValidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtValidade() {
        return dtValidade;
    }

    /**
     * Define o valor da propriedade dtValidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtValidade(String value) {
        this.dtValidade = value;
    }

    /**
     * Obtém o valor da propriedade nomeTitular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeTitular() {
        return nomeTitular;
    }

    /**
     * Define o valor da propriedade nomeTitular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeTitular(String value) {
        this.nomeTitular = value;
    }

    /**
     * Obtém o valor da propriedade nroCartao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroCartao() {
        return nroCartao;
    }

    /**
     * Define o valor da propriedade nroCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroCartao(String value) {
        this.nroCartao = value;
    }

}
