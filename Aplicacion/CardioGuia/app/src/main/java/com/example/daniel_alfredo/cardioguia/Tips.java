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
        Intent i = new Intent();
        i.setAction(action);
        sendBroadcast(i);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_tips, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
