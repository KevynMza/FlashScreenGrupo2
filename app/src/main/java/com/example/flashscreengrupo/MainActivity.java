package com.example.flashscreengrupo;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimerTask timertask = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Layout1.class);
                startActivity(intent);
            }
        };
        Timer time = new Timer();
        time.schedule(timertask,4000);
    }
}