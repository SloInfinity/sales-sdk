package de.lavego.saleTerminal.ui.nexo.model;

public class Command
{
    private             int    command = 0;
    private             String data    = "";
    
    public Command() {}
    
    public Command(int command) { this.command = command; }
    
    public Command(int command, String data)
    {
        this.command = command;
        this.data = data;
    }
    
    public int command() { return command; }
    
    public void command(int command) { this.command = command; }
    
    public String data() { return data; }
    
    public void data(String data) { this.data = data; }
}
