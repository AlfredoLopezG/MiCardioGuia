package com.example.daniel_alfredo.cardioguia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class Splash extends Activity {

    //Declaramos los segundo que se va a mostra el splash
    private final int DURACION_SPLASH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new android.os.Handler().postDelayed(new Runnable(){

            public void run(){
                //Cuando pasen los 3 segundos lanzamos la siguiente pantalla y finalzamos el splash
                Intent intent = new Intent(Splash.this, PantallaHome.class);
                startActivity(intent);
                finish();
            }
        }, DURACION_SPLASH);
    }

}
