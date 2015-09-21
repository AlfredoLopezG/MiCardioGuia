package com.example.daniel_alfredo.cardioguia;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.example.daniel_alfredo.cardioguia.database.DataBaseHelper;


public class Splash extends Activity {

    private final int DURACION_SPLASH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new android.os.Handler().postDelayed(new Runnable(){

            public void run(){
                Intent intent = new Intent(Splash.this, PantallaHome.class);
                startActivity(intent);
                finish();
            }
        }, DURACION_SPLASH);
    }

}
