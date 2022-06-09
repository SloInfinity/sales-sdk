//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.simpleframework.xml.Attribute;
/**
 * Definition: Number of coins or bills of a given value. -- Usage:
 * 				Indicates the remaining number of coins or bills of a given value in a cash handling
 * 				device. When the cash handling machine does not have any more coins or bills of a
 * 				certain value, the number must be equal to 0.
 *
 * <p>Java-Klasse für CoinsOrBillsType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CoinsOrBillsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="UnitValue" use="required" type="{}SimpleAmountType" />
 *       &lt;attribute name="Number" use="required" type="{}NumberType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class CoinsOrBillsType {
    @Attribute(name = "UnitValue", required = true)
    protected BigDecimal unitValue;
    @Attribute(name = "Number", required = true)
    protected BigInteger number;
    /**
     * Ruft den Wert der unitValue-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getUnitValue() {
        return unitValue;
    }
    /**
     * Legt den Wert der unitValue-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setUnitValue(BigDecimal value) {
        this.unitValue = value;
    }
    /**
     * Ruft den Wert der number-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getNumber() {
        return number;
    }
    /**
     * Legt den Wert der number-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }
}
