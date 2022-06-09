//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für TransactionTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Debit"/>
 *     &lt;enumeration value="Credit"/>
 *     &lt;enumeration value="ReverseDebit"/>
 *     &lt;enumeration value="ReverseCredit"/>
 *     &lt;enumeration value="OneTimeReservation"/>
 *     &lt;enumeration value="CompletedDeffered"/>
 *     &lt;enumeration value="FirstReservation"/>
 *     &lt;enumeration value="UpdateReservation"/>
 *     &lt;enumeration value="CompletedReservation"/>
 *     &lt;enumeration value="CashAdvance"/>
 *     &lt;enumeration value="IssuerInstalment"/>
 *     &lt;enumeration value="Declined"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="Award"/>
 *     &lt;enumeration value="ReverseAward"/>
 *     &lt;enumeration value="Redemption"/>
 *     &lt;enumeration value="ReverseRedemption"/>
 *     &lt;enumeration value="Rebate"/>
 *     &lt;enumeration value="ReverseRebate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum TransactionTypeEnumeration {
    /**
     * Payment Debit transactions (e.g. if PaymentType is
     * 						"Normal")
     *
     */
    
    DEBIT("Debit"),
    /**
     * Payment Credit transactions (e.g. if PaymentType is
     * 						"Refund")
     *
     */
    
    CREDIT("Credit"),
    /**
     * Payment Reversal Debit transactions
     *
     */
    
    REVERSE_DEBIT("ReverseDebit"),
    /**
     * Payment Reversal Credit transactions
     *
     */
    
    REVERSE_CREDIT("ReverseCredit"),
    /**
     * Outstanding OneTimeReservation transactions, i.e. between
     * 						OneTimeReservation and Completion
     *
     */
    
    ONE_TIME_RESERVATION("OneTimeReservation"),
    /**
     * OneTimeReservation transactions which have been completed by
     * 						the Completion.
     *
     */
    
    COMPLETED_DEFFERED("CompletedDeffered"),
    /**
     * Outstanding FirstReservation transactions, i.e. between
     * 						FirstReservation and UpdateReservation or Completion
     *
     */
    
    FIRST_RESERVATION("FirstReservation"),
    /**
     * Outstanding UpdateReservation transactions, i.e. between
     * 						UpdateReservation and UpdateReservation or Completion
     *
     */
    
    UPDATE_RESERVATION("UpdateReservation"),
    /**
     * Reservation transactions which have been completed by the
     * 						Completion.
     *
     */
    
    COMPLETED_RESERVATION("CompletedReservation"),
    /**
     * Cash Advance transactions.
     *
     */
    
    CASH_ADVANCE("CashAdvance"),
    /**
     * Issuer instalment transactions.
     *
     */
    
    ISSUER_INSTALMENT("IssuerInstalment"),
    /**
     * ResultErrorCondition
     *
     */
    
    DECLINED("Declined"),
    /**
     * ResultErrorCondition
     *
     */
    
    FAILED("Failed"),
    /**
     * Loyalty Award Transaction
     *
     */
    
    AWARD("Award"),
    /**
     * Loyalty Reversal Award Transaction
     *
     */
    
    REVERSE_AWARD("ReverseAward"),
    /**
     * Loyalty Redemption Transaction
     *
     */
    
    REDEMPTION("Redemption"),
    /**
     * Loyalty Reversal Redemption Transaction
     *
     */
    
    REVERSE_REDEMPTION("ReverseRedemption"),
    /**
     * Loyalty Rebate Transaction
     *
     */
    
    REBATE("Rebate"),
    /**
     * Loyalty Reversal Rebate Transaction
     *
     */
    
    REVERSE_REBATE("ReverseRebate");
    private final String value;
    TransactionTypeEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static TransactionTypeEnumeration fromValue(String v) {
        for (TransactionTypeEnumeration c: TransactionTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
