package com.example.pr3_17iit005;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Timer t = new Timer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Handler h = new Handler();
        final Runnable r = new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getApplicationContext(),"Toast, Toast!",Toast.LENGTH_SHORT).show();
            }
        };
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                h.post(r);
            }
        },60000,300000);
    }
}
