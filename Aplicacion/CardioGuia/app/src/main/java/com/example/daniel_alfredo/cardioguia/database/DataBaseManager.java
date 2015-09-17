package com.example.daniel_alfredo.cardioguia.database;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by daniel_alfredo on 15/09/15.
 */
public class DataBaseManager {

    public static final String TABLE_DATOS = "DatosPresion";

    public static final String ID = "_id";
    public static final String FECHAYHORA = "DiayHora";
    public static final String PRESION = "SistolicaDiastolica";
    public static final String PULSO = "Pulso";

    public static final String CREATE_TABLE =
            "create table " +TABLE_DATOS+ " ("
            + ID + " integer primary key autoincrement,"
            + FECHAYHORA + " text,"
            + PRESION + " text,"
            + PULSO + " text);";

    private DataBaseHelper helper;
    private SQLiteDatabase db;

    public DataBaseManager(Context context){
        helper = new DataBaseHelper(context);
        db = helper.getWritableDatabase();

    }

    public ContentValues generarContentValues(String fechayhora, String presion, String pulso){
        ContentValues valores = new ContentValues();
        valores.put(FECHAYHORA, fechayhora);
        valores.put(PRESION, presion);
        valores.put(PULSO, pulso);
        return valores;
    }


    public void insertarDatos(String fechayhora, String presion, String pulso){

        db.insert(TABLE_DATOS, null, generarContentValues(fechayhora, presion, pulso));
    }

    public Cursor cargarCursor (){

        String[] columnas = new String[]{ID, FECHAYHORA, PULSO};
        return db.query(TABLE_DATOS, columnas, null, null, null, null, null);
    }

}