//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für ReconciliationTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ReconciliationTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SaleReconciliation"/>
 *     &lt;enumeration value="AcquirerSynchronisation"/>
 *     &lt;enumeration value="AcquirerReconciliation"/>
 *     &lt;enumeration value="PreviousReconciliation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum ReconciliationTypeEnumeration {
    /**
     * Reconciliation with closure of the current period, without any
     * 						Acquirers synchronisation.
     *
     */
    SALE_RECONCILIATION("SaleReconciliation"),
    /**
     * Reconciliation and closure of the current period, with
     * 						synchronisation of the reconciliation between the POI and
     * 						Acquirers.
     *
     */
    
    ACQUIRER_SYNCHRONISATION("AcquirerSynchronisation"),
    /**
     * Reconciliation between the POI and one or several Acquirers
     * 						only. There is no reconciliation between the Sale System and the POI
     * 						System.
     *
     */
    
    ACQUIRER_RECONCILIATION("AcquirerReconciliation"),
    /**
     * Request result of a previous
     * 						reconciliation.
     *
     */
    
    PREVIOUS_RECONCILIATION("PreviousReconciliation");
    private final String value;
    ReconciliationTypeEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static ReconciliationTypeEnumeration fromValue(String v) {
        for (ReconciliationTypeEnumeration c: ReconciliationTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
