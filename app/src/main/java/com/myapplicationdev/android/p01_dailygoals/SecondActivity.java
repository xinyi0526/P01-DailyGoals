package com.myapplicationdev.android.p01_dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();
        String[] info = i.getStringArrayExtra("info");
        TextView tv1 = findViewById(R.id.textView);
        tv1.setText("Read up on materials before class : " + info[1] + "\nArrive on time so as not to miss important part of the lesson : " + info[2] + "\nAttempt the problem myself : " + info[3] + "\nReflection : " + info[0]);
    }
}
