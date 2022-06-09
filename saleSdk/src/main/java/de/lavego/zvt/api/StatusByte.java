package de.lavego.zvt.api;

import static de.lavego.zvt.api.Commons.asInt;

/**
 * Status-byte  Definition
 * xxxx xxx1    PT initialisation necessary
 * xxxx xx1x    Diagnosis necessary
 * xxxx x1xx    OPT action necessary
 * xxxx 1xxx    PT functions in filling station mode
 * xxx1 xxxx    PT functions in vending machine mode
 * xx1x xxxx    RFU
 * x1xx xxxx    RFU
 * 1xxx xxxx    RFU
 */
public class StatusByte
{
    private byte status = (byte) 0xFF;

    public StatusByte(byte status)
    {
        this.status = status;
    }

    public boolean vendingMachineMode()
    {
        return Commons.bit(this.status, 4) == 1;
    }

    public boolean fillingMachineMode()
    {
        return Commons.bit(this.status, 3) == 1;
    }

    public boolean needInitialisation()
    {
        return Commons.bit(this.status, 0) == 1;
    }

    public boolean needDiagnosis()
    {
        return Commons.bit(this.status, 1) == 1;
    }

    public boolean needOPTAction()
    {
        return Commons.bit(this.status, 2) == 1;
    }
    
    public byte value() { return status; }
    
    public int valueAsInt() { return asInt(status); }
}
