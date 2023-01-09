//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.09.03 at 02:04:08 PM MESZ 
//


package xmlData;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for units.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="units">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="kg"/>
 *     &lt;enumeration value="Liter"/>
 *     &lt;enumeration value="Stck"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "units")
@XmlEnum
public enum Units {

    @XmlEnumValue("kg")
    KG("kg"),
    @XmlEnumValue("Liter")
    LITER("Liter"),
    @XmlEnumValue("Stck")
    STCK("Stck");
    private final String value;

    Units(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Units fromValue(String v) {
        for (Units c: Units.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
