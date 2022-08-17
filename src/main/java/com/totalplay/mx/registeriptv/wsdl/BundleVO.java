//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.17 a las 12:28:02 PM CDT 
//


package com.totalplay.mx.registeriptv.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para bundleVO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bundleVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="charge" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="expiration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idCco" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="session" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tmCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bundleVO", propOrder = {
    "charge",
    "expiration",
    "idCco",
    "session",
    "tmCode"
})
public class BundleVO {

    protected boolean charge;
    protected String expiration;
    protected int idCco;
    protected String session;
    protected String tmCode;

    /**
     * Obtiene el valor de la propiedad charge.
     * 
     */
    public boolean isCharge() {
        return charge;
    }

    /**
     * Define el valor de la propiedad charge.
     * 
     */
    public void setCharge(boolean value) {
        this.charge = value;
    }

    /**
     * Obtiene el valor de la propiedad expiration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiration() {
        return expiration;
    }

    /**
     * Define el valor de la propiedad expiration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiration(String value) {
        this.expiration = value;
    }

    /**
     * Obtiene el valor de la propiedad idCco.
     * 
     */
    public int getIdCco() {
        return idCco;
    }

    /**
     * Define el valor de la propiedad idCco.
     * 
     */
    public void setIdCco(int value) {
        this.idCco = value;
    }

    /**
     * Obtiene el valor de la propiedad session.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSession() {
        return session;
    }

    /**
     * Define el valor de la propiedad session.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSession(String value) {
        this.session = value;
    }

    /**
     * Obtiene el valor de la propiedad tmCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmCode() {
        return tmCode;
    }

    /**
     * Define el valor de la propiedad tmCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmCode(String value) {
        this.tmCode = value;
    }

}
