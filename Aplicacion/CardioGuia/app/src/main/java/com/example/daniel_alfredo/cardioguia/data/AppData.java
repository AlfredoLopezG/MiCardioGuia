package com.example.daniel_alfredo.cardioguia.data;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by daniel_alfredo on 15/09/15.
 */
public class AppData {

    public static void setsistolica(Context context, String sistolica){
        SharedPreferences sp = context.getSharedPreferences("CONFIG", context.MODE_PRIVATE);
        //obtener el objeto que nos permite editar el archivo
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("Sistolica", sistolica);
        editor.commit();
    }

    public static void setDiastolica(Context context, String distolica){
        SharedPreferences sp = context.getSharedPreferences("CONFIG", context.MODE_PRIVATE);
        //obtener el objeto que nos permite editar el archivo
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("Diastolica", distolica);
        editor.commit();
    }

    //Metodo para saber su el usuario tiene la sesion inciciada o no
    public static String getSistolica (Context context){
        SharedPreferences sp = context.getSharedPreferences("CONFIG", context.MODE_PRIVATE);
        //Obtener el valor de un dato que persiste en las perferencias
        return sp.getString("Sistolica", "0");

    }

    public static String getDiastolica (Context context){
        SharedPreferences sp = context.getSharedPreferences("CONFIG", context.MODE_PRIVATE);
        //Obtener el valor de un dato que persiste en las perferencias
        return sp.getString("Diastolica", "0");

    }



}
