package com.myapplicationdev.android.p01_dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.buttonOK);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rg1 = (RadioGroup) findViewById(R.id.RadioGroup1);
                int selectButtonId1 = rg1.getCheckedRadioButtonId();
                RadioButton rb1 = (RadioButton) findViewById(selectButtonId1);
                RadioGroup rg2 = (RadioGroup) findViewById(R.id.RadioGroup2);
                int selectButtonId2 = rg2.getCheckedRadioButtonId();
                RadioButton rb2 = (RadioButton) findViewById(selectButtonId2);
                RadioGroup rg3 = (RadioGroup) findViewById(R.id.RadioGroup3);
                int selectButtonId3 = rg3.getCheckedRadioButtonId();
                RadioButton rb3 = (RadioButton) findViewById(selectButtonId3);
                EditText etReflection = (EditText) findViewById(R.id.editText);
                String[] info = {etReflection.getText().toString(),rb1.getText().toString(),rb2.getText().toString(),rb3.getText().toString()};

                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("info",info);
                startActivity(i);

            }
        });
    }
}
