package com.example.evaluacioncontinua2ayasta.network;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;

import com.example.evaluacioncontinua2ayasta.R;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ProductGpc {
    private static final String TAG = ProductGpc.class.getSimpleName();
    public final String name;
    public final Uri dynamicUrl;
    public final String url;
    public final String price;

    public ProductGpc(String name, String dynamicUrl, String url, String price){
    this.name = name;
    this.dynamicUrl = Uri.parse(dynamicUrl);
    this.url = url;
    this.price = price;
    }
public static List<ProductGpc> initProductGpcList(Resources resources){
    InputStream inputStream = resources.openRawResource(R.raw.product);
    Writer writer = new StringWriter();
    char[] buffer = new char[1024];
    try{
        Reader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        int pointer;
        while ((pointer = reader.read(buffer))!=-1){
            writer.write(buffer,0 , pointer);
        }
    } catch (IOException exception){
        Log.e(TAG, "suena a jason pero es json y si hay error UWU",exception );

    }finally {
        try {
            inputStream.close();
        }catch (IOException exception){
            Log.e(TAG, "no se papu revisa ", exception);
        }
    }
    String jsonProductsString = writer.toString();
    Gson gson = new Gson();
    Type productListType = new TypeToken<ArrayList<ProductGpc>>(){
    }.getType();
    return gson.fromJson(jsonProductsString, productListType);

}
    }
