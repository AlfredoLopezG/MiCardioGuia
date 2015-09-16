package com.example.daniel_alfredo.cardioguia.broadcast;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

import com.example.daniel_alfredo.cardioguia.R;
import com.example.daniel_alfredo.cardioguia.Tips;

/**
 * Created by daniel_alfredo on 16/09/15.
 */
public class Notifications {

    public Notification createNotification(Context context){

        Intent i = new Intent();
        i.setClass(context, Tips.class);

        PendingIntent pendingIntent = PendingIntent.getActivity(context, 100, i, 0);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);

        //Icono en la pantalla
        builder.setSmallIcon(R.drawable.appicon);

        //TExto para cuando te llega la notificacion
        builder.setTicker("Se ha agregado un nuevo Tip");

        //Cuando quieres la notificaion
        builder.setWhen(System.currentTimeMillis());

        //Titulo de la notificacion
        builder.setContentTitle("Nuevo Tip de la Semana");

        //Mensaje de la notificacion
        builder.setContentText("La presion arterial es la que se conoce como \"alta\" ");

        //peding Intent
        builder.setContentIntent(pendingIntent);

        //Crear la notificacion
        Notification notification = builder.build();

        //Suene
        notification.defaults |= Notification.DEFAULT_SOUND;

        //Vibre
        notification.defaults |= Notification.DEFAULT_VIBRATE;

        //Encienda el led
        notification.defaults |= Notification.DEFAULT_LIGHTS;

        return notification;
    }

}
