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
 * <p>Java class for DoCaptureResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoCaptureResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}DoCaptureResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoCaptureResponseType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "doCaptureResponseDetails"
})
public class DoCaptureResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "DoCaptureResponseDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected DoCaptureResponseDetailsType doCaptureResponseDetails;

    /**
     * Gets the value of the doCaptureResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DoCaptureResponseDetailsType }
     *     
     */
    public DoCaptureResponseDetailsType getDoCaptureResponseDetails() {
        return doCaptureResponseDetails;
    }

    /**
     * Sets the value of the doCaptureResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoCaptureResponseDetailsType }
     *     
     */
    public void setDoCaptureResponseDetails(DoCaptureResponseDetailsType value) {
        this.doCaptureResponseDetails = value;
    }

}
