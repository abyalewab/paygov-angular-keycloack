//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.10 at 06:24:36 PM EAT 
//


package com.mycompany.myapp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalRememberMeOptInDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalRememberMeOptInDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalRememberMeOptIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalRememberMeOwnerDetails" type="{urn:ebay:apis:eBLBaseComponents}ExternalRememberMeOwnerDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalRememberMeOptInDetailsType", propOrder = {
    "externalRememberMeOptIn",
    "externalRememberMeOwnerDetails"
})
public class ExternalRememberMeOptInDetailsType {

    @XmlElement(name = "ExternalRememberMeOptIn")
    protected String externalRememberMeOptIn;
    @XmlElement(name = "ExternalRememberMeOwnerDetails")
    protected ExternalRememberMeOwnerDetailsType externalRememberMeOwnerDetails;

    /**
     * Gets the value of the externalRememberMeOptIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRememberMeOptIn() {
        return externalRememberMeOptIn;
    }

    /**
     * Sets the value of the externalRememberMeOptIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRememberMeOptIn(String value) {
        this.externalRememberMeOptIn = value;
    }

    /**
     * Gets the value of the externalRememberMeOwnerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalRememberMeOwnerDetailsType }
     *     
     */
    public ExternalRememberMeOwnerDetailsType getExternalRememberMeOwnerDetails() {
        return externalRememberMeOwnerDetails;
    }

    /**
     * Sets the value of the externalRememberMeOwnerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalRememberMeOwnerDetailsType }
     *     
     */
    public void setExternalRememberMeOwnerDetails(ExternalRememberMeOwnerDetailsType value) {
        this.externalRememberMeOwnerDetails = value;
    }

}
