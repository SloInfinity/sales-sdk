//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
/**
 * Definition: Status of cash handling device. -- Usage: Indicate the
 * 				status and the remaining coins and bill in a cash handling
 * 				device.
 *
 * <p>Java-Klasse für CashHandlingDeviceType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CashHandlingDeviceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CoinsOrBills" type="{}CoinsOrBillsType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CashHandlingOKFlag" use="required" type="{}CashHandlingOKFlagType" />
 *       &lt;attribute name="Currency" use="required" type="{}ISOCurrency3A" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class CashHandlingDeviceType {
    @Element(name = "CoinsOrBills", required = true)
    protected List<CoinsOrBillsType> coinsOrBills;
    @Attribute(name = "CashHandlingOKFlag", required = true)
    protected boolean cashHandlingOKFlag;
    @Attribute(name = "Currency", required = true)
    protected String currency;
    /**
     * Gets the value of the coinsOrBills property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coinsOrBills property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoinsOrBills().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoinsOrBillsType }
     *
     *
     */
    public List<CoinsOrBillsType> getCoinsOrBills() {
        if (coinsOrBills == null) {
            coinsOrBills = new ArrayList<CoinsOrBillsType>();
        }
        return this.coinsOrBills;
    }
    /**
     * Ruft den Wert der cashHandlingOKFlag-Eigenschaft ab.
     *
     */
    public boolean isCashHandlingOKFlag() {
        return cashHandlingOKFlag;
    }
    /**
     * Legt den Wert der cashHandlingOKFlag-Eigenschaft fest.
     *
     */
    public void setCashHandlingOKFlag(boolean value) {
        this.cashHandlingOKFlag = value;
    }
    /**
     * Ruft den Wert der currency-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCurrency() {
        return currency;
    }
    /**
     * Legt den Wert der currency-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCurrency(String value) {
        this.currency = value;
    }
}
