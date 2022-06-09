package de.lavego.sdk;

import java.util.ArrayList;

public class CompletionForStatusResult extends CompletionForGenericResult
{
    public final ArrayList<String> applications   = new ArrayList<>();
    public final ArrayList<String> serials        = new ArrayList<>();
    public final ArrayList<String> devices        = new ArrayList<>();
    public final ArrayList<String> versions       = new ArrayList<>();
    public       int               status         = 0x00;
    public       String            version        = "";
}
