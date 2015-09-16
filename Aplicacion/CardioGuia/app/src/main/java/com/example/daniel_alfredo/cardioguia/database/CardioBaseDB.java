package com.example.daniel_alfredo.cardioguia.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.daniel_alfredo.cardioguia.models.Presion;

import java.util.ArrayList;


/**
 * Created by daniel_alfredo on 15/09/15.
 */
public class CardioBaseDB {

    private static CardioBaseDB cardioBaseDB;
    private DataBaseHelper helper;
    private SQLiteDatabase db;

    public CardioBaseDB(Context context){
        helper = new DataBaseHelper(context, DataBaseHelper.DATABASE_NAME, null, 1);
    }

    public CardioBaseDB getInstance (Context contex){
        if (cardioBaseDB ==null)
            cardioBaseDB = new CardioBaseDB(contex);
        return cardioBaseDB;
    }

    public void insertaDatos(Presion presion){
        ContentValues values = new ContentValues();
        values.put("fechayhora", presion.getFechayhora());
        values.put("sistolica", presion.getSistolica());
        values.put("diastolica", presion.getDiastolica());
        values.put("presion", presion.getPresion());

        SQLiteDatabase db = helper.getWritableDatabase();

        db.insert(DataBaseHelper.TABLE_PRESION, null, values);
        db.close();
    }

    public ArrayList<Presion> getAllProducts() {
        ArrayList<Presion> presions = new ArrayList<>();
        SQLiteDatabase db = helper.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM" + DataBaseHelper.TABLE_PRESION, null);

        if(cursor.moveToFirst()){
            do {
                String fechayhora = cursor.getString(0);
                String sistolica = cursor.getString(1);
                String diastolica = cursor.getString(2);
                String pulso = cursor.getString(1);


                Presion presion = new Presion(fechayhora, sistolica, diastolica, pulso);
                presions.add(presion);

            }while (cursor.moveToNext());

        }else{

        }

        return presions;

    }

}
