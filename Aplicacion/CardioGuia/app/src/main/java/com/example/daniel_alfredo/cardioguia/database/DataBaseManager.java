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
    public static final String PRESIONYPULSO = "Presion";


    public static final String CREATE_TABLE =
            "create table " +TABLE_DATOS+ " ("
            + ID + " integer primary key autoincrement,"
            + FECHAYHORA + " text,"
            + PRESIONYPULSO + " text);";

    private DataBaseHelper helper;
    private SQLiteDatabase db;

    public DataBaseManager(Context context){
        helper = new DataBaseHelper(context);
        db = helper.getWritableDatabase();

    }

    public ContentValues generarContentValues(String fechayhora, String presionypulso){
        ContentValues valores = new ContentValues();
        valores.put(FECHAYHORA, fechayhora);
        valores.put(PRESIONYPULSO, presionypulso);
        return valores;
    }


    public void insertarDatos(String fechayhora, String presionypulso){

        db.insert(TABLE_DATOS, null, generarContentValues(fechayhora, presionypulso));
    }

    public Cursor cargarCursor (){

        String[] columnas = new String[]{ID, FECHAYHORA, PRESIONYPULSO};
        return db.query(TABLE_DATOS, columnas, null, null, null, null, null);
    }

}