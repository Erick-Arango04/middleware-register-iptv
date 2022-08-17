//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.17 a las 01:32:12 PM CDT 
//


package com.totalplay.mx.registeriptv.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para profileVO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="profileVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clasificationAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="favoriteChannels" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idAvatar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idQuestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idSystemLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idbackground" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lockedChannels" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="notifications" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pro_advertising" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pro_readonly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="safe_night" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="text_proportion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updatePreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usePassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profileVO", propOrder = {
    "alias",
    "answer",
    "balance",
    "birthday",
    "clasificationAlias",
    "email",
    "favoriteChannels",
    "idAvatar",
    "idQuestion",
    "idSystemLanguage",
    "idbackground",
    "lockedChannels",
    "notifications",
    "password",
    "proAdvertising",
    "proReadonly",
    "safeNight",
    "sex",
    "textProportion",
    "updatePreference",
    "usePassword"
})
public class ProfileVO {

    protected String alias;
    protected String answer;
    protected String balance;
    protected String birthday;
    protected String clasificationAlias;
    protected String email;
    protected String favoriteChannels;
    protected String idAvatar;
    protected String idQuestion;
    protected String idSystemLanguage;
    protected String idbackground;
    protected String lockedChannels;
    protected String notifications;
    protected String password;
    @XmlElement(name = "pro_advertising")
    protected String proAdvertising;
    @XmlElement(name = "pro_readonly")
    protected String proReadonly;
    @XmlElement(name = "safe_night")
    protected String safeNight;
    protected String sex;
    @XmlElement(name = "text_proportion")
    protected String textProportion;
    protected String updatePreference;
    protected String usePassword;

    /**
     * Obtiene el valor de la propiedad alias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Define el valor de la propiedad alias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Obtiene el valor de la propiedad answer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Define el valor de la propiedad answer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswer(String value) {
        this.answer = value;
    }

    /**
     * Obtiene el valor de la propiedad balance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalance() {
        return balance;
    }

    /**
     * Define el valor de la propiedad balance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalance(String value) {
        this.balance = value;
    }

    /**
     * Obtiene el valor de la propiedad birthday.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * Define el valor de la propiedad birthday.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthday(String value) {
        this.birthday = value;
    }

    /**
     * Obtiene el valor de la propiedad clasificationAlias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClasificationAlias() {
        return clasificationAlias;
    }

    /**
     * Define el valor de la propiedad clasificationAlias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClasificationAlias(String value) {
        this.clasificationAlias = value;
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
     * Obtiene el valor de la propiedad favoriteChannels.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFavoriteChannels() {
        return favoriteChannels;
    }

    /**
     * Define el valor de la propiedad favoriteChannels.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFavoriteChannels(String value) {
        this.favoriteChannels = value;
    }

    /**
     * Obtiene el valor de la propiedad idAvatar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAvatar() {
        return idAvatar;
    }

    /**
     * Define el valor de la propiedad idAvatar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAvatar(String value) {
        this.idAvatar = value;
    }

    /**
     * Obtiene el valor de la propiedad idQuestion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdQuestion() {
        return idQuestion;
    }

    /**
     * Define el valor de la propiedad idQuestion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdQuestion(String value) {
        this.idQuestion = value;
    }

    /**
     * Obtiene el valor de la propiedad idSystemLanguage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSystemLanguage() {
        return idSystemLanguage;
    }

    /**
     * Define el valor de la propiedad idSystemLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSystemLanguage(String value) {
        this.idSystemLanguage = value;
    }

    /**
     * Obtiene el valor de la propiedad idbackground.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdbackground() {
        return idbackground;
    }

    /**
     * Define el valor de la propiedad idbackground.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdbackground(String value) {
        this.idbackground = value;
    }

    /**
     * Obtiene el valor de la propiedad lockedChannels.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockedChannels() {
        return lockedChannels;
    }

    /**
     * Define el valor de la propiedad lockedChannels.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockedChannels(String value) {
        this.lockedChannels = value;
    }

    /**
     * Obtiene el valor de la propiedad notifications.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifications() {
        return notifications;
    }

    /**
     * Define el valor de la propiedad notifications.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifications(String value) {
        this.notifications = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad proAdvertising.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProAdvertising() {
        return proAdvertising;
    }

    /**
     * Define el valor de la propiedad proAdvertising.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProAdvertising(String value) {
        this.proAdvertising = value;
    }

    /**
     * Obtiene el valor de la propiedad proReadonly.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProReadonly() {
        return proReadonly;
    }

    /**
     * Define el valor de la propiedad proReadonly.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProReadonly(String value) {
        this.proReadonly = value;
    }

    /**
     * Obtiene el valor de la propiedad safeNight.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafeNight() {
        return safeNight;
    }

    /**
     * Define el valor de la propiedad safeNight.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafeNight(String value) {
        this.safeNight = value;
    }

    /**
     * Obtiene el valor de la propiedad sex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Define el valor de la propiedad sex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * Obtiene el valor de la propiedad textProportion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextProportion() {
        return textProportion;
    }

    /**
     * Define el valor de la propiedad textProportion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextProportion(String value) {
        this.textProportion = value;
    }

    /**
     * Obtiene el valor de la propiedad updatePreference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatePreference() {
        return updatePreference;
    }

    /**
     * Define el valor de la propiedad updatePreference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatePreference(String value) {
        this.updatePreference = value;
    }

    /**
     * Obtiene el valor de la propiedad usePassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsePassword() {
        return usePassword;
    }

    /**
     * Define el valor de la propiedad usePassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsePassword(String value) {
        this.usePassword = value;
    }

}
