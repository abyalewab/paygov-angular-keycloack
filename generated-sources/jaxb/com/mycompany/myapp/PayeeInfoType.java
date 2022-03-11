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
 * 
 *                 PayeeInfoType
 *                 Payee Information
 *             
 * 
 * <p>Java class for PayeeInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayeeInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PayeeEmail" type="{urn:ebay:apis:eBLBaseComponents}EmailAddressType" minOccurs="0"/>
 *         &lt;element name="PayeeID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayeeInfoType", propOrder = {
    "payeeEmail",
    "payeeID"
})
public class PayeeInfoType {

    @XmlElement(name = "PayeeEmail")
    protected String payeeEmail;
    @XmlElement(name = "PayeeID")
    protected String payeeID;

    /**
     * Gets the value of the payeeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeEmail() {
        return payeeEmail;
    }

    /**
     * Sets the value of the payeeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeEmail(String value) {
        this.payeeEmail = value;
    }

    /**
     * Gets the value of the payeeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeID() {
        return payeeID;
    }

    /**
     * Sets the value of the payeeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeID(String value) {
        this.payeeID = value;
    }

}
