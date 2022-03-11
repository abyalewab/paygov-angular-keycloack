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
 * <p>Java class for UserSelectedFundingSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserSelectedFundingSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ELV"/>
 *     &lt;enumeration value="CreditCard"/>
 *     &lt;enumeration value="ChinaUnionPay"/>
 *     &lt;enumeration value="BML"/>
 *     &lt;enumeration value="Finance"/>
 *     &lt;enumeration value="QIWI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserSelectedFundingSourceType")
@XmlEnum
public enum UserSelectedFundingSourceType {

    ELV("ELV"),
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),
    @XmlEnumValue("ChinaUnionPay")
    CHINA_UNION_PAY("ChinaUnionPay"),
    BML("BML"),
    @XmlEnumValue("Finance")
    FINANCE("Finance"),
    QIWI("QIWI");
    private final String value;

    UserSelectedFundingSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserSelectedFundingSourceType fromValue(String v) {
        for (UserSelectedFundingSourceType c: UserSelectedFundingSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
