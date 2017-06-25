package com.example.choigyeongyun.alarm;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;

import static android.R.attr.data;

public class Main2Activity extends AppCompatActivity {
    Calendar time = Calendar.getInstance();
    TimePickerDialog.OnTimeSetListener timePickerListener = new TimePickerDialong.onTimeSetListener(){


        public void onTimeSet(TimePicker view, int hourOfDay, int minute){
            time.set(Calendar.HOUR_OF_DAY, hourOfDay);
            time.set(Calendar.MINUTE, minute);

            updateTime();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    public void ok(View v2){
        finish();
        Toast toast = Toast.makeText(getApplicationContext(), "알림설정이 완료되었습니다.", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 100);
        toast.show();
    }
}
