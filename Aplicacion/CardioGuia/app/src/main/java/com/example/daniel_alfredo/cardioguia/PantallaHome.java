package com.example.daniel_alfredo.cardioguia;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;


public class PantallaHome extends AppCompatActivity implements View.OnClickListener {
    private ImageButton btnmediciones;
    private ImageButton btnhta;
    private ImageButton btnvideos;
    private ImageButton btntips;
    private ImageButton btnbuencomer;
    private ImageButton btnbuenejercicio;
    private ImageButton btnalarmamedicamentos;
    private ImageButton btnalarmapresion;
    private ImageView imgcorazon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_home);

        initViews();
    }

    private void initViews(){

        imgcorazon = (ImageView)findViewById(R.id.imgcorazon);
        btnmediciones =(ImageButton)findViewById(R.id.imgbtnmediciones);
        btnhta =(ImageButton)findViewById(R.id.imgbtnhta);
        btnvideos =(ImageButton)findViewById(R.id.imgbtnvideos);
        btntips =(ImageButton)findViewById(R.id.imgbtntips);
        btnbuencomer =(ImageButton)findViewById(R.id.imgbtnbuencomer);
        btnbuenejercicio =(ImageButton)findViewById(R.id.imgbtnbuenejercicio);
        btnalarmamedicamentos =(ImageButton)findViewById(R.id.imgbtnalarmamedicamentos);
        btnalarmapresion=(ImageButton)findViewById(R.id.imgbtnalarmatomarpresion);


        btnmediciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irALaSiguientePantalla(1);
            }
        });

        btnhta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irALaSiguientePantalla(2);
            }
        });

        btnvideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irALaSiguientePantalla(3);
            }
        });

        btntips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irALaSiguientePantalla(4);
            }
        });

        btnbuencomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irALaSiguientePantalla(5);
            }
        });

        btnbuenejercicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irALaSiguientePantalla(6);
            }
        });

        btnalarmamedicamentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irALaSiguientePantalla(7);
            }
        });

        btnalarmapresion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irALaSiguientePantalla(8);
            }
        });

    }

    @Override
    public void onClick(View v) {

    }

    private void irALaSiguientePantalla(int boton){
        if (boton == 1){
            Intent intent = new Intent();
            intent.setClass(this, Mediciones.class);

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String currentDateandTime = sdf.format(new Date());

            Bundle b = new Bundle();
            b.putString("Fecha", currentDateandTime);
            intent.putExtras(b);

            startActivity(intent);
        }

        if (boton == 2){
            Intent intent = new Intent();
            intent.setClass(this, Hta.class);
            startActivity(intent);
        }


        if (boton == 3){
            Intent intent = new Intent();
            intent.setClass(this, Videos.class);
            startActivity(intent);
        }

        if (boton == 4){
            Intent intent = new Intent();
            intent.setClass(this, Tips.class);
            startActivity(intent);
        }

        if (boton == 5){
            Intent intent = new Intent();
            intent.setClass(this, BuenComer.class);
            startActivity(intent);
        }


        if (boton == 6){
            Intent intent = new Intent();
            intent.setClass(this, BuenEjercicio.class);
            startActivity(intent);
        }


        if (boton == 7){
            Intent intent = new Intent();
            intent.setClass(this, AlarmaMedicamentos.class);
            startActivity(intent);
        }


        if (boton == 8){
            Intent intent = new Intent();
            intent.setClass(this, AlarmaTomadePresion.class);
            startActivity(intent);
        }

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pantalla_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}

