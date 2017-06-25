package com.example.choigyeongyun.alarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private boolean switchFlag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn1(View v){
        Intent intent1 = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent1);
    }

    /*public class Alarm{
        private Context context;
        public Alarm(Context context){
            this.context = context;
        }
        public void alarm(){
            AlarmManager am = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
            Intent intent = new Intent(MainActivity.this, BroadAlarm.class);

            PendingIntent sender = PendingIntent.getBroadcast(MainActivity.this, 0, intent, 0);

            Calendar calendar = Calendar.getInstance();

            calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), 7, 30, 0);

            am.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), sender);
        }
    }*/

    public void switch1(View v) {
        AlarmManager am1 = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent intent1 = new Intent(MainActivity.this, BroadAlarm.class);
        PendingIntent sender1 = PendingIntent.getBroadcast(MainActivity.this, 1, intent1, 0);
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(calendar1.get(Calendar.YEAR), calendar1.get(Calendar.MONTH), calendar1.get(Calendar.DATE), 19, 34, 0);
        am1.set(AlarmManager.RTC_WAKEUP, calendar1.getTimeInMillis(), sender1);

        /*AlarmManager am2 = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent intent2 = new Intent(MainActivity.this, BroadAlarm.class);
        PendingIntent sender2 = PendingIntent.getBroadcast(MainActivity.this, 2, intent2, PendingIntent.FLAG_NO_CREATE);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(calendar2.get(Calendar.YEAR), calendar2.get(Calendar.MONTH), calendar2.get(Calendar.DATE), 11, 30, 0);
        am2.set(AlarmManager.RTC_WAKEUP, calendar2.getTimeInMillis(), sender2);

        AlarmManager am3 = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent intent3 = new Intent(MainActivity.this, BroadAlarm.class);
        PendingIntent sender3 = PendingIntent.getBroadcast(MainActivity.this, 3, intent3, PendingIntent.FLAG_NO_CREATE);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(calendar3.get(Calendar.YEAR), calendar3.get(Calendar.MONTH), calendar3.get(Calendar.DATE), 19, 20, 0);
        am3.set(AlarmManager.RTC_WAKEUP, calendar3.getTimeInMillis(), sender3);*/
    }


    public void switch2(View v){
        AlarmManager am1 = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
        Intent intent1 = new Intent(MainActivity.this, BroadAlarm.class);
        PendingIntent sender1 = PendingIntent.getBroadcast(MainActivity.this, 1, intent1, 0);
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(calendar1.get(Calendar.YEAR), calendar1.get(Calendar.MONTH), calendar1.get(Calendar.DATE), 8, 30, 0);
        am1.set(AlarmManager.RTC_WAKEUP, calendar1.getTimeInMillis(), sender1);

        /*AlarmManager am2 = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
        Intent intent2 = new Intent(MainActivity.this, BroadAlarm.class);
        PendingIntent sender2 = PendingIntent.getBroadcast(MainActivity.this, 2, intent2, PendingIntent.FLAG_NO_CREATE);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(calendar2.get(Calendar.YEAR), calendar2.get(Calendar.MONTH), calendar2.get(Calendar.DATE), 13, 30, 0);
        am2.set(AlarmManager.RTC_WAKEUP, calendar2.getTimeInMillis(), sender2);

        AlarmManager am3 = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
        Intent intent3 = new Intent(MainActivity.this, BroadAlarm.class);
        PendingIntent sender3 = PendingIntent.getBroadcast(MainActivity.this, 3, intent3, PendingIntent.FLAG_NO_CREATE);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(calendar3.get(Calendar.YEAR), calendar3.get(Calendar.MONTH), calendar3.get(Calendar.DATE), 20, 30, 0);
        am3.set(AlarmManager.RTC_WAKEUP, calendar3.getTimeInMillis(), sender3);*/
    }
}
