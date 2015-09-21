package com.example.daniel_alfredo.cardioguia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Ejercicios extends AppCompatActivity {

    public String dato;
    public TextView ejercicio;
    public TextView descripcion;
    public ImageView imgejercicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicios);

        initViews();
    }

    public void initViews(){

        ejercicio = (TextView)findViewById(R.id.tvtitulo);
        descripcion = (TextView)findViewById(R.id.tvdescripcion);
        imgejercicio = (ImageView)findViewById(R.id.imgejercicio);


        Bundle bundle = this.getIntent().getExtras();

        dato = bundle.getString("posicion");

        if (dato.equals("Ejercicio 1")){
            imgejercicio.setImageResource(R.drawable.e01);
            ejercicio.setText(bundle.getString("posicion"));
            descripcion.setText("Recargado en una pared, realizar elevacion de pierna extendidadesde el soporte hasta la altura de la cadeara aproximadamente\n\tTeniendo atencion en que la pierna de soporte no se flexione o se eleve a puntas, realizar 15 elevaciones con una pierna y despues realizar con la otra pierna");
        }

        if (dato.equals("Ejercicio 2")){
            imgejercicio.setImageResource(R.drawable.e02);
            ejercicio.setText(bundle.getString("posicion"));
            descripcion.setText("De manera lateral a la pared o bien con ayuda de una silla; se realiza un elevacion lateral con giro de rodilla hacia aproximadamente a la altura de la cadera y girar a la posicion inicial al momento de bajar para columpiar por el frente de la del soporte en forma de pendulo.\nEl movimiento se realiza 15 veces con cada pierna");
        }

        if (dato.equals("Ejercicio 3")){
            imgejercicio.setImageResource(R.drawable.e03);
            ejercicio.setText(bundle.getString("posicion"));
            descripcion.setText("De frente a la pared se relazza un flexion de rodilla elevando a la altura de la cadera, para continuar con una extension de la pierna hacia atras sin flexionar la rodilla al momento de elevar el talon debe de llegar a la altura de la rodilla de la pierna de soporte. Se realiza 15 elevaciones con cada pierna");
        }

        if (dato.equals("Ejercicio 4")){
            imgejercicio.setImageResource(R.drawable.e04);
            ejercicio.setText(bundle.getString("posicion"));
            descripcion.setText("Con ayuda de un cajon o bien de un escalon de aproximadamente 20 cm.Se apoya un pie sobre el y el otro quedando apoyando sobre el piso se realiza una elevacion del pie apoyando sobre el cajon y de la pierna de abajo se realiza una patada por enfrente hacia arriba. para luego bajar a la posicion incial de ambas piernas.Se realiza 10 elevaciones con cada pierna");
        }
        if (dato.equals("Ejercicio 5")){
            imgejercicio.setImageResource(R.drawable.e05);
            ejercicio.setText(bundle.getString("posicion"));
            descripcion.setText("Tumbado sobre el piso y manteniendo las piernas flexionadas apoyadas sobre el piso, las rodillas deben  de tener una separación aproximada de los hombros se realiza una elevación del tronco hasta donde las manos puedan tocar las rodillas de manera cruzada se eleva y se baja al hacer cada toque. Se realizan 10 toques a cada pierna.");
        }
        if (dato.equals("Ejercicio 6")){
            imgejercicio.setImageResource(R.drawable.e06);
            ejercicio.setText(bundle.getString("posicion"));
            descripcion.setText("Tumbado sobre el piso apoyando los brazos en los laterales se elevan las piernas a 90 grados para realizar flexión-extensión por enfrente del pecho o estomago. Se realizan 15 elevación\\/flexión.");
        }
        if (dato.equals("Ejercicio 7")){
            imgejercicio.setImageResource(R.drawable.e07);
            ejercicio.setText(bundle.getString("posicion"));
            descripcion.setText("Tumbado sobre el piso apoyando  las piernas el los laterales se elevan las piernas a 90 grados extendidas para abrir y cerrar las piernas aproximadamente la separación de los hombros. Se realizan 20 separaciones.");
        }
        if (dato.equals("Ejercicio 8")){
            imgejercicio.setImageResource(R.drawable.e08);
            ejercicio.setText(bundle.getString("posicion"));
            descripcion.setText("Tumbado sobre el piso apoyando las pierna sobre los laterales se elevan las piernas aproximadamente 20 cm del piso y se realizan patadas de manera alternada simulando la patada de natación se realizan 15 patadas.");
        }
        if (dato.equals("Ejercicio 9")){
            imgejercicio.setImageResource(R.drawable.e09);
            ejercicio.setText(bundle.getString("posicion"));
            descripcion.setText("Tumbado sobre el piso de forma lateral se flexiona el brazo mas cercano al piso poniendo la mano cerca del oído y el codo por el frente al nivel de los ojos y la otra mano se apoya en el piso por enfrente a la altura del pecho para que sirva de apoyo se eleva el tronco de forma lateral sin ayuda del brazo cercano al piso. Se realizan 15 elevaciones de cada lado.");
        }
        if (dato.equals("Ejercicio 10")){
            imgejercicio.setImageResource(R.drawable.e10);
            ejercicio.setText(bundle.getString("posicion"));
            descripcion.setText("Tumbado sobre el piso boca abajo se realizan elevaciones de pierna por atrás hasta donde se pueda elevar sin flexionar la rodilla se realizan 30 elevaciones de cada pierna por separado.");
        }
        if (dato.equals("Ejercicio 11")){
            imgejercicio.setImageResource(R.drawable.e11);
            ejercicio.setText(bundle.getString("posicion"));
            descripcion.setText("En posición de gato de eleva la pierna con la mano contraria y manteniendo la vista al frente es importante mantener el estomago contraído para evitar que se arqueé y lastime la espalda. Se realizan 10 elevaciones de manera alternada con cada pierna\\/mano.");
        }
        if (dato.equals("Ejercicio 12")){
            imgejercicio.setImageResource(R.drawable.e12);
            ejercicio.setText(bundle.getString("posicion"));
            descripcion.setText("Tumbado sobre el piso y manteniendo las piernas siempre flexionadas se suben los brazos por enfrente a la altura del pecho para luego pasar extendidas por atrás de los oídos y regresar por enfrente hasta las rodillas. Este ejercicio se realiza con una mancuerna de 1 hasta 3 libras para evitar esfuerzo. Se realizan 15 movimientos.");
        }
        if (dato.equals("Ejercicio 13")){
            imgejercicio.setImageResource(R.drawable.e13);
            ejercicio.setText(bundle.getString("posicion"));
            descripcion.setText("Tumbado sobre el piso y manteniendo las piernas flexionadas se abren los brazos a nivel del pecho, para luego subirlos por enfrente-arriba al nivel del pecho. Este ejercicio se realiza con una mancuerna de 1 hasta 3 libras para evitar esfruezos. Se realizan 15 movimientos de abrir cerrar.");
        }
        if (dato.equals("Ejercicio 14")){
            imgejercicio.setImageResource(R.drawable.e14);
            ejercicio.setText(bundle.getString("posicion"));
            descripcion.setText("Sentado en una silla con las piernas abiertas y pies apoyados sobre el piso y la espalda recta se eleva un brazo por arriba de la cabeza para luego flexionarlo por atrás de la cabeza y luego extenderlo de nuevo. Se realiza con mancuerna de 1 hasta 3 libras para evitar esfuerzo. El movimiento se realiza 20 veces con cada brazo por separado.");
        }
        if (dato.equals("Ejercicio 15")){
            imgejercicio.setImageResource(R.drawable.e15);
            ejercicio.setText(bundle.getString("posicion"));
            descripcion.setText("Sentado sobre una silla con las piernas abiertas y pies apoyados sobre el piso se flexionan los brazos con las palmas hacia arriba quedando ya flexionados al nivel del pecho y las palmas pegadas al cuerpo se extienden hasta un ángulo de aproximadamente 160 grados para luego flexionar de nuevo el movimiento se realiza con mancuernas hasta de 1 Kg. Y se realizan 20 flexiones.");
        }
        if (dato.equals("Ejercicio 16")){
            imgejercicio.setImageResource(R.drawable.e16);
            ejercicio.setText(bundle.getString("posicion"));
            descripcion.setText("De pie apoyando las manos sobre el respaldo de una silla o bien en la pared con el estomago contraído, se realizan elevaciones de punta de los pies hasta llegar a la máxima altura posible y se bajan los talones para luego repetir el movimiento. Se realizan 30 elevaciones.");
        }


    }











    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_ejercicios, menu);
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
