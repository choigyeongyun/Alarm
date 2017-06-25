package com.example.choigyeongyun.alarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class Main2Activity extends AppCompatActivity {
    Calendar time = Calendar.getInstance();
    Calendar period = Calendar.getInstance();
    private int mHour, mMinute, mPeriodHour, mPeriodMinute;
    TextView mTime, mPeriod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mHour = time.get(Calendar.HOUR_OF_DAY);
        mMinute = time.get(Calendar.MINUTE);
        mPeriodHour = period.get(Calendar.HOUR);
        mPeriodMinute = period.get(Calendar.MINUTE);
        updateNow();

        mTime = (TextView)findViewById(R.id.txtTime);
        mPeriod = (TextView)findViewById(R.id.txtPeriod);

    }

    @Override
    public View findViewById(@IdRes int id) {
        return super.findViewById(id);
    }

    void updateTime(){
        mTime.setText(String.format("시작시간 : %d : %d", mHour, mMinute));
        mPeriod.setText(String.format("주기 : %d : %d", mPeriodHour, mPeriodMinute));
    }

    void updateNow(){
        AlarmManager am = (AlarmManager)getSystemService(Context.ALARM_SERVICE);

        Intent intent = new Intent(Main2Activity.this, BroadAlarm.class);

        PendingIntent sender = PendingIntent.getBroadcast(Main2Activity.this, 0, intent, 0);

        Calendar calendar = Calendar.getInstance();

        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), mHour+mPeriodHour, mMinute+mPeriodMinute);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), mHour+mPeriodHour*2, mMinute+mPeriodMinute*2);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), mHour+mPeriodHour*3, mMinute+mPeriodMinute*3);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), mHour+mPeriodHour*4, mMinute+mPeriodMinute*4);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), mHour+mPeriodHour*5, mMinute+mPeriodMinute*5);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), mHour+mPeriodHour*6, mMinute+mPeriodMinute*6);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), mHour+mPeriodHour*7, mMinute+mPeriodMinute*7);

        am.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), sender);
    }

    public void time(View v){
        new TimePickerDialog(Main2Activity.this, timePickerListener1, mHour, mMinute, false).show();
    }

    public void period(View v){
        new TimePickerDialog(Main2Activity.this, timePickerListener2, mPeriodHour, mPeriodMinute, false).show();
    }

    public TimePickerDialog.OnTimeSetListener timePickerListener1 = new TimePickerDialog.OnTimeSetListener() {
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            time.set(Calendar.HOUR_OF_DAY, hourOfDay);
            time.set(Calendar.MINUTE, minute);
            updateNow();
        }
    };

    public TimePickerDialog.OnTimeSetListener timePickerListener2 = new TimePickerDialog.OnTimeSetListener(){
        public void onTimeSet(TimePicker view, int hourOfDay, int minute){
            period.set(Calendar.HOUR, hourOfDay);
            period.set(Calendar.MINUTE, minute);
            updateNow();
            updateTime();
        }
    };

    public void ok(View v2){
        finish();
        Toast toast = Toast.makeText(getApplicationContext(), "알림설정이 완료되었습니다.", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 100);
        toast.show();
    }
}
