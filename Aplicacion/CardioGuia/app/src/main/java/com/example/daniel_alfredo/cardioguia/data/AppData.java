package com.example.daniel_alfredo.cardioguia.data;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by daniel_alfredo on 15/09/15.
 */
public class AppData {
    private final String sistolica = "0";
    private final String diastolica = "0";

    private Context mContext;

    public AppData(Context context){
        mContext = context;
    }

    private SharedPreferences getSettings(){
        return mContext.getSharedPreferences("HMprefs", 0);
    }

    public String getsostilca(){
        return getSettings().getString(sistolica, "0");
    }

    public String getDiastolica(){
        return getSettings().getString(diastolica, "0");
    }

    public void setSistolica(Context context){

    }

    public void setDiastolica(String d){

    }
}
