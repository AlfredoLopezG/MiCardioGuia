package com.example.daniel_alfredo.cardioguia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class BuenEjercicio extends AppCompatActivity implements View.OnClickListener {
    private String ejercicio;
    public String descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buen_ejercicio);
        initViews();
    }

    public void initViews(){

        ejercicio=new String("Ejercicio ");
        ListView lv= (ListView)findViewById(R.id.lvejercicios);
        final ArrayList<String> ejercicios = new ArrayList<>();

        for (int i = 1;i<=16;i++){
            ejercicios.add(ejercicio + i);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ejercicios);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                irAEjercicio(ejercicios.get(position).toString());
            }
        });



    }

    private void irAEjercicio(String pos){

        Intent intent = new Intent();
        intent.setClass(this, Ejercicios.class);
        Bundle b = new Bundle();
        b.putString("posicion", pos);
        intent.putExtras(b);

        startActivity(intent);


    }



    @Override
    public void onClick(View v) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_buen_ejercicio, menu);
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
