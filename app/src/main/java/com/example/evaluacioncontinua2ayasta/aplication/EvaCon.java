package com.example.evaluacioncontinua2ayasta.aplication;


import android.app.Application;
import android.content.Context;

import androidx.appcompat.app.AppCompatDelegate;

public class EvaCon extends Application {
    private static EvaCon instance;
    private static Context appContext;
    public static EvaCon getInstance(){
        return instance;
    }
    public static Context getAppContext(){
    return appContext;
    }
    public void setAppContext(Context mContext){
    this.appContext =mContext;
    }
    @Override
    public void onCreate(){
        super.onCreate();
        instance = this;
        this.setAppContext(getApplicationContext());
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }
}