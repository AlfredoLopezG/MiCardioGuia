package com.example.daniel_alfredo.cardioguia;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

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

        String[] from = new String[]{manager.FECHAYHORA, manager.PRESIONYPULSO};
        int[] to = new int [] {android.R.id.text1, android.R.id.text2};
        cursor = manager.cargarCursor();
        adapter = new SimpleCursorAdapter(this, android.R.layout.two_line_list_item, cursor, from, to, 0);
        lvhistorial.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_historial, menu);
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
