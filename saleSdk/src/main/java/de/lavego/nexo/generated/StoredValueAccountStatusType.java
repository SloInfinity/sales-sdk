//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import java.math.BigDecimal;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
/**
 * Definition: Data related to the result of the stored value card
 * 				transaction. -- Usage: It contains: - the identification of the stored value
 * 				accounts or the stored value cards - the identification of the transaction by the
 * 				stored value host - the balance of the stored value account if
 * 				relevant
 *
 * <p>Java-Klasse für StoredValueAccountStatusType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="StoredValueAccountStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StoredValueAccountID" type="{}StoredValueAccountIDType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CurrentBalance" type="{}SimpleAmountType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class StoredValueAccountStatusType {
    @Element(name = "StoredValueAccountID", required = true)
    protected StoredValueAccountIDType storedValueAccountID;
    @Attribute(name = "CurrentBalance", required = false)
    protected BigDecimal currentBalance;
    /**
     * Ruft den Wert der storedValueAccountID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link StoredValueAccountIDType }
     *
     */
    public StoredValueAccountIDType getStoredValueAccountID() {
        return storedValueAccountID;
    }
    /**
     * Legt den Wert der storedValueAccountID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link StoredValueAccountIDType }
     *
     */
    public void setStoredValueAccountID(StoredValueAccountIDType value) {
        this.storedValueAccountID = value;
    }
    /**
     * Ruft den Wert der currentBalance-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }
    /**
     * Legt den Wert der currentBalance-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCurrentBalance(BigDecimal value) {
        this.currentBalance = value;
    }
}
