package com.example.choigyeongyun.alarm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

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

    public void switch1(View v){

    }

    public void switch2(View v){

    }
}
