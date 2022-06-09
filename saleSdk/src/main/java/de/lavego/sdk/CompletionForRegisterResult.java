package de.lavego.sdk;

public class CompletionForRegisterResult extends CompletionForGenericResult
{
    public boolean needInitialisation = false;
    public boolean needDiagnosis      = false;
    public boolean needOPTAction      = false;
    public boolean fillingMachineMode = false;
    public boolean vendingMachineMode = false;
    public int     status             = 0x00;
}
