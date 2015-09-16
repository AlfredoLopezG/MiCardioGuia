package com.example.daniel_alfredo.cardioguia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;


public class PantallaHome extends Activity implements View.OnClickListener {
    private ImageButton btnmediciones;
    private ImageButton btnhta;
    private ImageButton btnvideos;
    private ImageButton btntips;
    private ImageButton btnbuencomer;
    private ImageButton btnbuenejercicio;
    private ImageButton btnalarmamedicamentos;
    private ImageButton btnalarmapresion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_home);

        initViews();
    }

    private void initViews(){

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
            Toast.makeText(this, "Ir secciones", Toast.LENGTH_LONG).show();

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
            Toast.makeText(this, "Ir a HTA", Toast.LENGTH_LONG).show();
            Intent intent = new Intent();
            intent.setClass(this, Hta.class);
            startActivity(intent);
        }


        if (boton == 3){
            Toast.makeText(this, "Ir a Videos", Toast.LENGTH_LONG).show();
            Intent intent = new Intent();
            intent.setClass(this, Videos.class);
            startActivity(intent);
        }

        if (boton == 4){
            Toast.makeText(this, "Ir a Tips", Toast.LENGTH_LONG).show();
            Intent intent = new Intent();
            intent.setClass(this, Tips.class);
            startActivity(intent);
        }

        if (boton == 5){
            Toast.makeText(this, "Ir a Buen comer", Toast.LENGTH_LONG).show();
            Intent intent = new Intent();
            intent.setClass(this, BuenComer.class);
            startActivity(intent);
        }


        if (boton == 6){
            Toast.makeText(this, "Ir a Buen Ejercicio", Toast.LENGTH_LONG).show();
            Intent intent = new Intent();
            intent.setClass(this, BuenEjercicio.class);
            startActivity(intent);
        }


        if (boton == 7){
            Toast.makeText(this, "Ir a Alarma de medicamentos", Toast.LENGTH_LONG).show();
        }


        if (boton == 8){
            Toast.makeText(this, "Ir a Alarma de Tomar presion", Toast.LENGTH_LONG).show();
        }

    }

    /*private void lanzarMensajeDeBroadcast(){
        String action= "com.example.daniel_alfredo.targetcares.action.NOTIFY";

        //Creamos el inent con la accion que queremos ejecutar
        Intent i = new Intent();
        i.setAction(action);

        //Enviar el mensaje de broadcast
        sendBroadcast(i);
    }*/

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

