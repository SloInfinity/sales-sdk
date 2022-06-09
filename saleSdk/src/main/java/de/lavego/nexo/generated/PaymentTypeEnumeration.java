//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für PaymentTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Refund"/>
 *     &lt;enumeration value="OneTimeReservation"/>
 *     &lt;enumeration value="FirstReservation"/>
 *     &lt;enumeration value="UpdateReservation"/>
 *     &lt;enumeration value="Completion"/>
 *     &lt;enumeration value="CashAdvance"/>
 *     &lt;enumeration value="CashDeposit"/>
 *     &lt;enumeration value="Recurring"/>
 *     &lt;enumeration value="Instalment"/>
 *     &lt;enumeration value="IssuerInstalment"/>
 *     &lt;enumeration value="PaidOut"/>
 *     &lt;enumeration value="VoiceAuthorisation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum PaymentTypeEnumeration {
    /**
     * Normal Payment
     *
     */
    
    NORMAL("Normal"),
    /**
     * Payment refund
     *
     */
    
    REFUND("Refund"),
    /**
     * One time reservation to be just followed by a completion when
     * 						the service or good is delivered. This service is sometimes called "Deferred
     * 						Sale".
     *
     */
    
    ONE_TIME_RESERVATION("OneTimeReservation"),
    /**
     * First reservation for an amount and period of time. This
     * 						service is sometimes called "Pre-Authorisation".
     *
     */
    
    FIRST_RESERVATION("FirstReservation"),
    /**
     * Adjustment of the amount or period of time of a reservation.
     *
     *
     */
    
    UPDATE_RESERVATION("UpdateReservation"),
    /**
     * End of the reservation transaction.
     *
     */
    
    COMPLETION("Completion"),
    /**
     * Cash advance at the POI System.
     *
     */
    
    CASH_ADVANCE("CashAdvance"),
    /**
     * Cash deposit at the POI System, to credit an
     * 						account.
     *
     */
    
    CASH_DEPOSIT("CashDeposit"),
    /**
     * Recurring payment.
     *
     */
    
    RECURRING("Recurring"),
    /**
     * Instalments of payment performed on behalf of the
     * 						merchant.
     *
     */
    
    INSTALMENT("Instalment"),
    /**
     * Instalments of payment performed by the card
     * 						issuer.
     *
     */
    
    ISSUER_INSTALMENT("IssuerInstalment"),
    /**
     * Give money to in return for goods or services rendered to the
     * 						merchant.
     *
     */
    
    PAID_OUT("PaidOut"),
    /**
     * After a referral, an authorisation code is provided in the
     * 						payment request to complete the transaction.
     *
     */
    
    VOICE_AUTHORISATION("VoiceAuthorisation");
    private final String value;
    PaymentTypeEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static PaymentTypeEnumeration fromValue(String v) {
        for (PaymentTypeEnumeration c: PaymentTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
