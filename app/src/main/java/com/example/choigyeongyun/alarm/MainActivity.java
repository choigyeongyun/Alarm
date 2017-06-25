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

    public void switch1(View v){
        AlarmManager am = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(MainActivity.this, BroadAlarm.class);

        PendingIntent sender = PendingIntent.getBroadcast(MainActivity.this, 0, intent, 0);

        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), 10, 25, 0);
/*
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), 7, 30, 0);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), 11, 30, 0);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), 18, 30, 0);*/

        am.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), sender);
    }


    public void switch2(View v){
        AlarmManager am = (AlarmManager)getSystemService(Context.ALARM_SERVICE);

        Intent intent = new Intent(MainActivity.this, BroadAlarm.class);

        PendingIntent sender = PendingIntent.getBroadcast(MainActivity.this, 0, intent, 0);

        Calendar calendar = Calendar.getInstance();

        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), 14, 2, 0);

        /*calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), 8, 30, 0);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), 13, 30, 0);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), 20, 30, 0);*/

        am.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), sender);

    }

}
