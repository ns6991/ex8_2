package com.example.ex8_2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Switch switch1;
    RadioGroup radioGroup;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;
    Button button;
    LinearLayout linearLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switch1 = (Switch) findViewById(R.id.switch1);
        radioGroup = (RadioGroup) findViewById(R.id.rg) ;
        rb1 = (RadioButton) findViewById(R.id.radioButton1);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        rb4 = (RadioButton) findViewById(R.id.radioButton4);
        button = (Button) findViewById(R.id.button);
        linearLayout = findViewById(R.id.all);

    }




    public void clicked(View view) {
        if(!switch1.isChecked()){
            if(view.getId()==R.id.button) {
                if (rb1.isChecked()) linearLayout.setBackgroundColor(Color.YELLOW);
                if (rb2.isChecked()) linearLayout.setBackgroundColor(Color.BLUE);
                if (rb3.isChecked()) linearLayout.setBackgroundColor(Color.GREEN);
                if (rb4.isChecked()) linearLayout.setBackgroundColor(Color.RED);
            }
        }
    }

    public void clicked1(View view) {
        if(switch1.isChecked()){
            if(rb1.isChecked()) linearLayout.setBackgroundColor(Color.YELLOW);
        }
    }
    public void clicked2(View view) {
        if(switch1.isChecked()){
            if(rb2.isChecked()) linearLayout.setBackgroundColor(Color.BLUE);
        }
    }
    public void clicked3(View view) {
        if(switch1.isChecked()){
            if(rb3.isChecked()) linearLayout.setBackgroundColor(Color.GREEN);
        }
    }
    public void clicked4(View view) {
        if(switch1.isChecked()){
            if(rb4.isChecked()) linearLayout.setBackgroundColor(Color.RED);
        }
    }



}