package com.example.daniel_alfredo.cardioguia;


import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TableRow;
import java.text.SimpleDateFormat;
import java.util.Date;


public class PantallaHome extends AppCompatActivity implements View.OnClickListener {
    private ImageButton btnmediciones;
    private ImageButton btnhta;
    private ImageButton btnvideos;
    private ImageButton btntips;
    private ImageButton btnbuencomer;
    private ImageButton btnbuenejercicio;
    private ImageButton btnalarmamedicamentos;
    private ImageButton btnalarmapresion;
    private ImageView imgcorazon;

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private final String ACTIONBAR_COLOR = "#FF0000";
    private String mCurrentTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_home);

        initSlidingMenu();
        initViews();
    }



    private void initViews(){

        TableRow btnHome=(TableRow)findViewById(R.id.entryHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irALaSiguientePantalla(10);
            }
        });

        TableRow btnMedicamentos=(TableRow)findViewById(R.id.entryMedicamentos);
        btnMedicamentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irALaSiguientePantalla(7);
            }
        });

        TableRow btnPresion=(TableRow)findViewById(R.id.entryPresion);
        btnPresion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irALaSiguientePantalla(8);
            }
        });

        TableRow btnHistorial=(TableRow)findViewById(R.id.entryHistorial);
        btnHistorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irALaSiguientePantalla(11);
            }
        });

        TableRow btnConfiguraciones=(TableRow)findViewById(R.id.entryConfiguracion);
        btnConfiguraciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irALaSiguientePantalla(9);
            }
        });


        imgcorazon = (ImageView)findViewById(R.id.imgcorazon);
        btnmediciones =(ImageButton)findViewById(R.id.imgbtnmediciones);
        btnhta =(ImageButton)findViewById(R.id.imgbtnhta);
        btnvideos =(ImageButton)findViewById(R.id.imgbtnvideos);
        btntips =(ImageButton)findViewById(R.id.imgbtntips);
        btnbuencomer =(ImageButton)findViewById(R.id.imgbtnbuencomer);
        btnbuenejercicio =(ImageButton)findViewById(R.id.imgbtnbuenejercicio);
        btnalarmamedicamentos =(ImageButton)findViewById(R.id.imgbtnalarmamedicamentos);
        btnalarmapresion=(ImageButton)findViewById(R.id.imgbtnalarmatomarpresion);

        ScaleAnimation localScaleAnimation = new ScaleAnimation(1.0F, 1.2F, 1.0F, 1.2F, 50.0F, 50.0F);
        localScaleAnimation.setRepeatCount(-1);
        localScaleAnimation.setDuration(700L);
        imgcorazon.setAnimation(localScaleAnimation);



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
            Intent intent = new Intent();
            intent.setClass(this, Hta.class);
            startActivity(intent);
        }


        if (boton == 3){
            Intent intent = new Intent();
            intent.setClass(this, Videos.class);
            startActivity(intent);
        }

        if (boton == 4){
            Intent intent = new Intent();
            intent.setClass(this, Tips.class);
            startActivity(intent);
        }

        if (boton == 5){
            Intent intent = new Intent();
            intent.setClass(this, BuenComer.class);
            startActivity(intent);
        }


        if (boton == 6){
            Intent intent = new Intent();
            intent.setClass(this, BuenEjercicio.class);
            startActivity(intent);
        }


        if (boton == 7){
            mDrawerLayout.closeDrawers();
            Intent intent = new Intent();
            intent.setClass(this, AlarmaMedicamentos.class);
            startActivity(intent);
        }


        if (boton == 8){
            mDrawerLayout.closeDrawers();
            Intent intent = new Intent();
            intent.setClass(this, AlarmaTomadePresion.class);
            startActivity(intent);
        }

        if (boton == 9){
            mDrawerLayout.closeDrawers();
            Intent intent = new Intent();
            intent.setClass(this, Configuracion.class);
            startActivity(intent);
        }

        if (boton == 10){
            mDrawerLayout.closeDrawers();
        }

        if (boton == 11){
            mDrawerLayout.closeDrawers();
            Intent intent = new Intent();
            intent.setClass(this, Historial.class);
            startActivity(intent);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    private void initSlidingMenu() {
        final ActionBar actionBar = getSupportActionBar();

        mCurrentTitle = "CardioGuia";

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow,
                GravityCompat.START);

        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);

        actionBar.setBackgroundDrawable(
                new ColorDrawable(Color.parseColor(ACTIONBAR_COLOR)));

        mDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout, R.string.drawer_open,R.string.drawer_close) {
            public void onDrawerClosed(View view) {
                actionBar.setTitle(mCurrentTitle);
                supportInvalidateOptionsMenu();
                super.onDrawerClosed(view);
            }

            public void onDrawerOpened(View drawerView) {
                actionBar.setTitle("CardioGuia");
                supportInvalidateOptionsMenu();
                super.onDrawerOpened(drawerView);
            }
        };

        mDrawerLayout.setDrawerListener(mDrawerToggle);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

}

