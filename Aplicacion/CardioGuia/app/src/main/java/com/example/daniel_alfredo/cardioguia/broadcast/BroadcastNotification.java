package com.example.daniel_alfredo.cardioguia.broadcast;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by daniel_alfredo on 16/09/15.
 */
public class BroadcastNotification extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Notifications notifications = new Notifications();
        Notification notification = notifications.createNotification(context);

        NotificationManager notificaionManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        int notifificationId = 100;
        notificaionManager.notify(notifificationId, notification);


    }
}
