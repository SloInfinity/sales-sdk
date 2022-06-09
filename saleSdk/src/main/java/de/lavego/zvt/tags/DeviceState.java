package de.lavego.zvt.tags;

import java.io.IOException;

import de.lavego.zvt.api.Tag;

import static de.lavego.zvt.api.Commons.asInt;
import static de.lavego.zvt.api.Commons.bit;

/**
 * Bit Description (byte one)
 * <p>
 * b7 Lock of reconciliation with closure b6 Initialization lock
 * b6 Initialization lock
 * b5 Diagnosis lock
 * b4 Service lock
 * b3 Out of order
 * b2 Printer lock
 * b1 Terminal start up needed b0 Secure module changed
 * b0 Secure module changed
 * <p>
 * Bit Description (byte two)
 * <p>
 * b7 Transaction log defective b6 Card reader not found b5 Card still inserted
 * b6 Card reader not found
 * b5 Card still inserted
 * b4 Secure link not ready
 * b3 Activation needed
 * b2 Low battery power
 * b1 Contactless reader not initialized b0 MDB not ready
 * b0 MDB not ready
 */
public class DeviceState extends Tag
{
    public DeviceState(byte[] data)
            throws IOException
    {
        super((byte) 0x1f, (byte) 0x55, data);
    }

    public DeviceState(byte one, byte two)
            throws IOException
    {
        super((byte) 0x1f, (byte) 0x55, new byte[]{one, two});
    }

    public boolean isLocked()
    {
        return !(asInt(value()[0]) == 0 && asInt(value()[1]) == 0);
    }

    public Lock lock()
    {
        byte one = value()[0];
        byte two = value()[1];

        if (bit(one, 7) == 0x01) { return Lock.ReconciliationWithClosure; }
        else if (bit(one, 6) == 0x01) { return Lock.Initialization; }
        else if (bit(one, 5) == 0x01) { return Lock.Diagnosis; }
        else if (bit(one, 4) == 0x01) { return Lock.Service; }
        else if (bit(one, 3) == 0x01) { return Lock.OutOfOrder; }
        else if (bit(one, 2) == 0x01) { return Lock.Printer; }
        else if (bit(one, 1) == 0x01) { return Lock.TerminalStartUpNeeded; }
        else if (bit(one, 0) == 0x01) { return Lock.SecureModuleChanged; }
        else if (bit(two, 7) == 0x01) { return Lock.TransactionLogDefective; }
        else if (bit(two, 6) == 0x01) { return Lock.CardReaderNotFound; }
        else if (bit(two, 5) == 0x01) { return Lock.CardStillInserted; }
        else if (bit(two, 4) == 0x01) { return Lock.SecureLinkNotReady; }
        else if (bit(two, 3) == 0x01) { return Lock.ActivationNeeded; }
        else if (bit(two, 2) == 0x01) { return Lock.LowBatteryPower; }
        else if (bit(two, 1) == 0x01) { return Lock.ContactlessReadNotInitialized; }
        else if (bit(two, 0) == 0x01) { return Lock.MdbNotReady; }
        else { return Lock.NotLocked; }
    }

    public enum Lock
    {
        NotLocked, ReconciliationWithClosure, Initialization, Diagnosis, Service, OutOfOrder, Printer, TerminalStartUpNeeded, SecureModuleChanged, TransactionLogDefective,
        CardReaderNotFound, CardStillInserted, SecureLinkNotReady, ActivationNeeded, LowBatteryPower, ContactlessReadNotInitialized, MdbNotReady
    }
}
