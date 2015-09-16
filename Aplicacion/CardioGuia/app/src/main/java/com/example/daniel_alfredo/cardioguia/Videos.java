package com.example.daniel_alfredo.cardioguia;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Videos extends Activity implements View.OnClickListener{
    private ImageButton btntomarpresion;
    private ImageButton btnhipertension;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        initViews();
    }

    private void initViews(){

        btntomarpresion = (ImageButton)findViewById(R.id.btnver1);
        btnhipertension = (ImageButton)findViewById(R.id.btnver2);

        btntomarpresion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irAVideo(1);
            }
        });

        btnhipertension.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               irAVideo(2);
            }
        });
    }


    @Override
    public void onClick(View v) {

    }

    private void irAVideo (int boton){

        if (boton==1){
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=4XVGx7-O-TY")));
        }

        if (boton==2){
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=m0tACT5kusM")));
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_videos, menu);
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
