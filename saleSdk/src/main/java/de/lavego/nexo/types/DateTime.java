package de.lavego.nexo.types;

import androidx.annotation.NonNull;

import org.simpleframework.xml.Text;
import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

import de.lavego.nexo.Commons;

public class DateTime implements Converter<DateTime>
{
    @Text(required = true)
    protected String dateTime;
    
    public DateTime() { setDateTime(String.valueOf(System.currentTimeMillis())); }
    
    public DateTime(@NonNull String dt) { setDateTime(dt);}
    
    @Override
    public DateTime read(InputNode node) throws Exception
    {
        if (node.isElement() && node.getName().equals("DateTime"))
        {
            return new DateTime(node.getValue());
        }
        return null;
    }
    
    @Override
    public void write(OutputNode node, DateTime value) throws Exception
    {
        if (node.getName().equals("DateTime"))
        {
            node.setValue(value.getDateTime());
        }
    }
    
    public String getDateTime()
    {
        return Commons.transform(dateTime);
    }
    
    public void setDateTime(String dateTime)
    {
        this.dateTime = Commons.transform(dateTime);
    }
}
