package com.example.android_data_shared_preference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                SharedPreferences preference = getSharedPreferences("login", MODE_PRIVATE);
                Boolean check = preference.getBoolean("flag", false);

                Intent iNext;
                if(check)
                {
                    iNext = new Intent(MainActivity.this, HomeActivity.class);
                }
                else
                {
                    iNext = new Intent(MainActivity.this, LoginActivity.class);
                }

                startActivity(iNext);
            }
        }, 4000);
    }
}