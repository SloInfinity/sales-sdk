//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import android.util.Log;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

import de.lavego.nexo.Commons;

/**
 * Definition: Identification of a transaction for the Sale System or the
 * POI System.
 *
 * <p>Java-Klasse für TransactionIdentificationType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TransactionIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="TransactionID" use="required" type="{}TransactionIDType" />
 *       &lt;attribute name="TimeStamp" use="required" type="{}TimeStampType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
public class TransactionIdentificationType implements Converter<TransactionIdentificationType>
{
    @Attribute(name = "TransactionID", required = true)
    protected String transactionID;
    @Attribute(name = "TimeStamp", required = true)
    protected String timeStamp;
    
    @Override
    public TransactionIdentificationType read(InputNode node) throws Exception
    {
        Log.d("NEXO_TEST", "TransactionIdentificationType::read " + node.getName());
    
        InputNode txId = node.getAttribute("TransactionID");
        InputNode ts = node.getAttribute("TimeStamp");
        
        TransactionIdentificationType transactionIdentificationType = new TransactionIdentificationType();
    
        if(txId != null) transactionIdentificationType.setTransactionID(txId.getValue());
        if(ts != null) transactionIdentificationType.setTimeStamp(Commons.transform(ts.getValue()));
        
        return transactionIdentificationType;
    }
    
    @Override
    public void write(OutputNode node, TransactionIdentificationType value) throws Exception
    {
        Log.d("NEXO_TEST", "TransactionIdentificationType::write");
        String transactionId = value.getTransactionID();
        String timeStamp     = value.getTimeStamp();
        
        if (transactionId != null && ! transactionId.isEmpty()) { node.setAttribute("TransactionID", transactionId); }
        if (timeStamp != null && ! timeStamp.isEmpty()) { node.setAttribute("TimeStamp", Commons.transform(timeStamp)); }
    }
    
    /**
     * Ruft den Wert der transactionID-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTransactionID()
    {
        return transactionID;
    }
    
    /**
     * Legt den Wert der transactionID-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTransactionID(String value)
    {
        this.transactionID = value;
    }
    
    /**
     * Ruft den Wert der timeStamp-Eigenschaft ab.
     *
     * @return possible object is
     */
    public String getTimeStamp()
    {
        return timeStamp;
    }
    
    /**
     * Legt den Wert der timeStamp-Eigenschaft fest.
     *
     * @param value allowed object is
     */
    public void setTimeStamp(String value)
    {
        this.timeStamp = value;
    }
}
