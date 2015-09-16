package com.example.daniel_alfredo.cardioguia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class Tips extends AppCompatActivity implements View.OnClickListener{
    private ImageButton btncuadroigris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        btncuadroigris=(ImageButton)findViewById(R.id.btncuadrogris);

        btncuadroigris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarMensajeDeBroadcast();

            }
        });
    }

    @Override
    public void onClick(View v) {

    }


    private void lanzarMensajeDeBroadcast(){
        String action= "com.example.daniel_alfredo.cardioguia.action.NOTIFY";

        //Creamos el inent con la accion que queremos ejecutar
        Intent i = new Intent();
        i.setAction(action);

        //Enviar el mensaje de broadcast
        sendBroadcast(i);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tips, menu);
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
