package de.lavego.sdk;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Modifier;

public class GoogleGson
{
    private static final GoogleGson ourInstance = new GoogleGson();
    
    private Gson gson = null;
    
    private GoogleGson()
    {
        gson = new GsonBuilder().setPrettyPrinting()
                                .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
                                .excludeFieldsWithModifiers(Modifier.STATIC).create();
    }
    
    public static Gson Gson()
    {
        return ourInstance.gson;
    }
}


