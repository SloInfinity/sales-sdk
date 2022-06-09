package de.lavego.zvt;

import de.lavego.zvt.api.Apdu;

public class ZvtMessage
{
    private final Apdu    command;
    private final boolean shutdown;

    public ZvtMessage(Apdu command)
    {
        this.command  = command;
        this.shutdown = false;
    }

    public ZvtMessage()
    {
        this.command  = null;
        this.shutdown = true;
    }

    public Apdu command()
    {
        return command;
    }

    public boolean isShutdown()
    {
        return shutdown;
    }
}
