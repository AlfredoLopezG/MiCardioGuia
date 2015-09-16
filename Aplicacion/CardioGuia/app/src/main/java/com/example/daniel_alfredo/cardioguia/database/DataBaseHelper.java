package com.example.daniel_alfredo.cardioguia.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by daniel_alfredo on 15/09/15.
 */
public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="CardioGuia.sqlite";

    public static final String TABLE_PRESION ="Presion";

    private final String generatePresion =
            "CREATE TABLE" + TABLE_PRESION + "(id TEXT, fechayhora TEXT, sistolica TEXT, diastolica TEXT, pulso TEXT)";

    private final String dropPrecion = "DROP TABLE IF EXIST" + TABLE_PRESION;

    public DataBaseHelper (Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context, name, factory, version);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(generatePresion);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(dropPrecion);
        onCreate(db);

    }
}
