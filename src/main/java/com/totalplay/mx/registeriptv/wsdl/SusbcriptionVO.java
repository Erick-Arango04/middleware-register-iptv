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
 * <p>Clase Java para susbcriptionVO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="susbcriptionVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billinCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contrac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="havepromotion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mainPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="providerAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="segmentation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subscriberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tmcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "susbcriptionVO", propOrder = {
    "billinCycle",
    "contrac",
    "email",
    "havepromotion",
    "mainPlanId",
    "providerAlias",
    "segmentation",
    "statusSuscriptor",
    "subscriberType",
    "tmcode"
})
public class SusbcriptionVO {

    protected String billinCycle;
    protected String contrac;
    protected String email;
    protected String havepromotion;
    protected String mainPlanId;
    protected String providerAlias;
    protected String segmentation;
    protected String statusSuscriptor;
    protected String subscriberType;
    protected String tmcode;

    /**
     * Obtiene el valor de la propiedad billinCycle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillinCycle() {
        return billinCycle;
    }

    /**
     * Define el valor de la propiedad billinCycle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillinCycle(String value) {
        this.billinCycle = value;
    }

    /**
     * Obtiene el valor de la propiedad contrac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrac() {
        return contrac;
    }

    /**
     * Define el valor de la propiedad contrac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrac(String value) {
        this.contrac = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad havepromotion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHavepromotion() {
        return havepromotion;
    }

    /**
     * Define el valor de la propiedad havepromotion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHavepromotion(String value) {
        this.havepromotion = value;
    }

    /**
     * Obtiene el valor de la propiedad mainPlanId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainPlanId() {
        return mainPlanId;
    }

    /**
     * Define el valor de la propiedad mainPlanId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainPlanId(String value) {
        this.mainPlanId = value;
    }

    /**
     * Obtiene el valor de la propiedad providerAlias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderAlias() {
        return providerAlias;
    }

    /**
     * Define el valor de la propiedad providerAlias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderAlias(String value) {
        this.providerAlias = value;
    }

    /**
     * Obtiene el valor de la propiedad segmentation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentation() {
        return segmentation;
    }

    /**
     * Define el valor de la propiedad segmentation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentation(String value) {
        this.segmentation = value;
    }

    /**
     * Obtiene el valor de la propiedad statusSuscriptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusSuscriptor() {
        return statusSuscriptor;
    }

    /**
     * Define el valor de la propiedad statusSuscriptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusSuscriptor(String value) {
        this.statusSuscriptor = value;
    }

    /**
     * Obtiene el valor de la propiedad subscriberType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberType() {
        return subscriberType;
    }

    /**
     * Define el valor de la propiedad subscriberType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberType(String value) {
        this.subscriberType = value;
    }

    /**
     * Obtiene el valor de la propiedad tmcode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmcode() {
        return tmcode;
    }

    /**
     * Define el valor de la propiedad tmcode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmcode(String value) {
        this.tmcode = value;
    }

}
