//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import de.lavego.nexo.Commons;

/**
 * <p>Java-Klasse für ResultEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ResultEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="Failure"/>
 *     &lt;enumeration value="Partial"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum ResultEnumeration {
    /**
     * Processing OK. Information related to the result of the
     * 						processing is contained in other parts of the response
     * 						message.
     *
     */
    
    SUCCESS("Success"),
    /**
     * ErrorCondition
     *
     */
    
    FAILURE("Failure"),
    /**
     * The transaction has been processed successfully, but the
     * 						success is not complete (e.g. only a partial amount is available for the
     * 						payment, the format to be
     *
     */
    
    PARTIAL("Partial");
    private final String value;
    ResultEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static ResultEnumeration fromValue(String v) {
        v = Commons.fixItFelixEnumerationValue(v);
        for (ResultEnumeration c: ResultEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
