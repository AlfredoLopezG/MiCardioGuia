package com.example.daniel_alfredo.cardioguia;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import com.example.daniel_alfredo.cardioguia.database.DataBaseManager;

public class Historial extends AppCompatActivity {

    private DataBaseManager manager;
    private Cursor cursor;
    private ListView lvhistorial;
    SimpleCursorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);

        manager = new DataBaseManager(this);
        lvhistorial= (ListView)findViewById(R.id.lvHistorial);
        //String presion = "Presion" + manager.PRESION + "Pulso" + manager.PULSO;

        //Toast.makeText(this, presion, Toast.LENGTH_LONG).show();

        String[] from = new String[]{manager.FECHAYHORA, manager.PRESIONYPULSO};
        //String[] from = new String[]{fromaux[0], (fromaux[1] + fromaux[2])};
        int[] to = new int [] {android.R.id.text1, android.R.id.text2};
        cursor = manager.cargarCursor();
        adapter = new SimpleCursorAdapter(this, android.R.layout.two_line_list_item, cursor, from, to, 0);
        lvhistorial.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_historial, menu);
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
