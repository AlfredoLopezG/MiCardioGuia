package com.example.daniel_alfredo.cardioguia.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by daniel_alfredo on 15/09/15.
 */
public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="CardioGuia.sqlite";



    public DataBaseHelper (Context context){
        super(context, DATABASE_NAME, null, 1);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(DataBaseManager.CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


    }
}
