package com.example.daniel_alfredo.cardioguia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class Videos extends AppCompatActivity implements View.OnClickListener{
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
        getMenuInflater().inflate(R.menu.menu_videos, menu);
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
