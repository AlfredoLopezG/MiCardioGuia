package com.example.daniel_alfredo.cardioguia;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.daniel_alfredo.cardioguia.data.AppData;

public class Meta extends AppCompatActivity implements View.OnClickListener {

    public EditText sistolicaalta;
    public EditText diastolicabaja;
    public Button btnAceptar;
    //private configuracion conf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meta);

        initViews();
    }

    private void initViews(){
        sistolicaalta =(EditText)findViewById(R.id.sistolicaalta);
        diastolicabaja =(EditText)findViewById(R.id.diastolicabaja);
        btnAceptar = (Button)findViewById(R.id.btnAceptar);

        btnAceptar.setOnClickListener(this);

        sistolicaalta.setText(AppData.getSistolica(this));
        diastolicabaja.setText(AppData.getDiastolica(this));

    }



    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Guardado",Toast.LENGTH_LONG ).show();
        AppData.setsistolica(getBaseContext(), sistolicaalta.getText().toString());
        AppData.setDiastolica(getBaseContext(), diastolicabaja.getText().toString());

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_meta, menu);
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
