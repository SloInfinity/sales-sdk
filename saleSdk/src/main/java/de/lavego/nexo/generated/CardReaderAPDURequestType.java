//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
/**
 * Definition: Content of the Card Reader APDU Request message. -- Usage:
 * 				It contains the APDU request to send to the chip of the card, and a possible
 * 				invitation message to display on the CashierInterface or the
 * 				CustomerInterface.
 *
 * <p>Java-Klasse für CardReaderAPDURequestType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CardReaderAPDURequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APDUData" type="{}APDUDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="APDUClass" use="required" type="{}APDUClassType" />
 *       &lt;attribute name="APDUInstruction" use="required" type="{}APDUInstructionType" />
 *       &lt;attribute name="APDUPar1" use="required" type="{}APDUPar1Type" />
 *       &lt;attribute name="APDUPar2" use="required" type="{}APDUPar2Type" />
 *       &lt;attribute name="APDUExpectedLength" type="{}APDUExpectedLengthType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class CardReaderAPDURequestType {
    @Element(name = "APDUData", required = false)
    protected byte[] apduData;
    @Attribute(name = "APDUClass", required = true)
    protected byte[] apduClass;
    @Attribute(name = "APDUInstruction", required = true)
    protected byte[] apduInstruction;
    @Attribute(name = "APDUPar1", required = true)
    protected byte[] apduPar1;
    @Attribute(name = "APDUPar2", required = true)
    protected byte[] apduPar2;
    @Attribute(name = "APDUExpectedLength", required = false)
    protected byte[] apduExpectedLength;
    /**
     * Ruft den Wert der apduData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAPDUData() {
        return apduData;
    }
    /**
     * Legt den Wert der apduData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAPDUData(byte[] value) {
        this.apduData = value;
    }
    /**
     * Ruft den Wert der apduClass-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAPDUClass() {
        return apduClass;
    }
    /**
     * Legt den Wert der apduClass-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAPDUClass(byte[] value) {
        this.apduClass = value;
    }
    /**
     * Ruft den Wert der apduInstruction-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAPDUInstruction() {
        return apduInstruction;
    }
    /**
     * Legt den Wert der apduInstruction-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAPDUInstruction(byte[] value) {
        this.apduInstruction = value;
    }
    /**
     * Ruft den Wert der apduPar1-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAPDUPar1() {
        return apduPar1;
    }
    /**
     * Legt den Wert der apduPar1-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAPDUPar1(byte[] value) {
        this.apduPar1 = value;
    }
    /**
     * Ruft den Wert der apduPar2-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAPDUPar2() {
        return apduPar2;
    }
    /**
     * Legt den Wert der apduPar2-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAPDUPar2(byte[] value) {
        this.apduPar2 = value;
    }
    /**
     * Ruft den Wert der apduExpectedLength-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAPDUExpectedLength() {
        return apduExpectedLength;
    }
    /**
     * Legt den Wert der apduExpectedLength-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAPDUExpectedLength(byte[] value) {
        this.apduExpectedLength = value;
    }
}
