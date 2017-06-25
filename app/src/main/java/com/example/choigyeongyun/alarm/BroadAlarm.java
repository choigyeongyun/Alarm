package com.example.choigyeongyun.alarm;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;

/**
 * Created by choigyeongyun on 2017-06-25.
 */

public class BroadAlarm extends BroadcastReceiver {
    String INTENT_ACTION = Intent.ACTION_BOOT_COMPLETED;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void onReceive(Context context, Intent intent){
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        PendingIntent pendingIntent = PendingIntent.getActivity(context, 1, new Intent(context, MainActivity.class), PendingIntent.FLAG_UPDATE_CURRENT);
        Notification.Builder builder = new Notification.Builder(context);
        builder = builder.setSmallIcon(R.drawable.on).setTicker("알람").setWhen(System.currentTimeMillis())
                .setNumber(1).setContentTitle("알약이").setContentText("약 먹을 시간입니다")
                .setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_VIBRATE).setContentIntent(pendingIntent).setAutoCancel(true);
        notificationManager.notify(1, builder.build());
        /*notificationManager.notify(2, builder.build());
        notificationManager.notify(3, builder.build());*/
    }
}
