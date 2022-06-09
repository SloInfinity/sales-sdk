package de.lavego.zvt.api;

public class ResultCode
{
    private final int    code;
    private final String text;

    public ResultCode()
    {
        this.code = ErrorCodes.Error00;
        this.text = ErrorCodes.ErrorMessage00;
    }

    public ResultCode(int code)
    {
        this.code = code & 0xff;
        this.text = ErrorCodes.errorByCode(code);
    }

    public int code()
    {
        return code;
    }

    public String text()
    {
        return text;
    }
}
