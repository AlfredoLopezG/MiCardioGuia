package com.example.daniel_alfredo.cardioguia;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.daniel_alfredo.cardioguia.database.CardioBaseDB;

import static android.widget.Toast.makeText;

public class Mediciones extends AppCompatActivity implements View.OnClickListener{

    public EditText fechayHora;
    public EditText sistolica;
    public EditText diastolica;
    public EditText pulso;
    private Button btnGuardar;
    private ImageButton btnHistorial;
    private ImageButton btnMeta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediciones);
        initViews();
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
        //String currentDateandTime = sdf.format(new Date());

        Bundle bundle = this.getIntent().getExtras();

        fechayHora.setText(bundle.getString("Fecha"));

    }

    private void initViews(){
        fechayHora=(EditText)findViewById(R.id.fechayhora);
        sistolica=(EditText)findViewById(R.id.sistolica);
        diastolica=(EditText)findViewById(R.id.diastolica);
        pulso=(EditText)findViewById(R.id.pulso);
        btnGuardar=(Button)findViewById(R.id.btnGuardar);
        btnHistorial=(ImageButton)findViewById(R.id.btnHistorial);
        btnMeta=(ImageButton)findViewById(R.id.btnMeta);

        btnHistorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irALaSiguientePantalla2(1);
            }
        });

        btnMeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irALaSiguientePantalla2(2);
            }
        });

        btnMeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irALaSiguientePantalla2(2);
            }
        });

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((fechayHora.getText().toString().trim().length() <=0)||(sistolica.getText().toString().trim().length() <=0)||
                        (diastolica.getText().toString().trim().length() <=0)||(pulso.getText().toString().trim().length() <=0)){
                    irALaSiguientePantalla2(4);
                }else{
                    irALaSiguientePantalla2(3);
                }
            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mediciones, menu);
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

    @Override
    public void onClick(View v) {

    }

    private void irALaSiguientePantalla2(int boton){
        if (boton == 1){
            Toast.makeText(this, "Ir Historiales", Toast.LENGTH_LONG).show();

            Intent intent = new Intent();
            intent.setClass(this, Historial.class);
            startActivity(intent);
        }

        if (boton == 2){
            Toast.makeText(this, "Ir a HTA", Toast.LENGTH_LONG).show();

            Intent intent = new Intent();
            intent.setClass(this, Meta.class);
            startActivity(intent);
        }

        if (boton == 3){
            Toast.makeText(this, "Guaradado " +  fechayHora.getText().toString(), Toast.LENGTH_LONG).show();
            CardioBaseDB manager = new CardioBaseDB(this);
            //manager.insertaDatos(fechayHora.getText().toString(), sistolica.getText().toString(), diastolica.getText().toString(), pulso.getText().toString());

        }

        if (boton == 4){
            Toast.makeText(this, "No se puede guardar por que hay campos vacios", Toast.LENGTH_LONG).show();
        }
    }
}