package de.lavego.sdk;

import android.content.Context;

import com.google.gson.Gson;

public class App extends android.app.Application
{
    private static Context context = null;
    
    public static Gson Gson()
    {
        return GoogleGson.Gson();
    }
    
    public static Context appContext() { return context; }
    
    @Override
    public void onCreate()
    {
        super.onCreate();
        context = getApplicationContext();
    }
    
    @Override
    public void onTerminate()
    {
        super.onTerminate();
    }
}
