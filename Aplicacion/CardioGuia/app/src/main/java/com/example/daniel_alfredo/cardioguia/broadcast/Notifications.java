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

        builder.setSmallIcon(R.drawable.appicon);
        builder.setTicker("Se ha agregado un nuevo Tip");
        builder.setWhen(System.currentTimeMillis());
        builder.setContentTitle("Nuevo Tip de la Semana");
        builder.setContentText("La presion arterial es la que se conoce como \"alta\" ");
        builder.setContentIntent(pendingIntent);
        Notification notification = builder.build();
        notification.defaults |= Notification.DEFAULT_SOUND;
        notification.defaults |= Notification.DEFAULT_VIBRATE;
        notification.defaults |= Notification.DEFAULT_LIGHTS;

        return notification;
    }

}
