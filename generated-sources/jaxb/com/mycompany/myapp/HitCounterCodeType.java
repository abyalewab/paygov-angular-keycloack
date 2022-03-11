//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.10 at 06:24:36 PM EAT 
//


package com.mycompany.myapp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HitCounterCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HitCounterCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NoHitCounter"/>
 *     &lt;enumeration value="HonestyStyle"/>
 *     &lt;enumeration value="GreenLED"/>
 *     &lt;enumeration value="Hidden"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HitCounterCodeType")
@XmlEnum
public enum HitCounterCodeType {


    /**
     * No hit counter
     * 
     */
    @XmlEnumValue("NoHitCounter")
    NO_HIT_COUNTER("NoHitCounter"),

    /**
     * 
     *                         Honesty Style Hit Counter
     *                     
     * 
     */
    @XmlEnumValue("HonestyStyle")
    HONESTY_STYLE("HonestyStyle"),

    /**
     * 
     *                         Green LED counter.																	
     * 
     */
    @XmlEnumValue("GreenLED")
    GREEN_LED("GreenLED"),

    /**
     * 
     *                         Hidden counter.
     *                     
     * 
     */
    @XmlEnumValue("Hidden")
    HIDDEN("Hidden"),

    /**
     * 
     *                         Reserved for internal or future use.
     *                     
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    HitCounterCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HitCounterCodeType fromValue(String v) {
        for (HitCounterCodeType c: HitCounterCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
