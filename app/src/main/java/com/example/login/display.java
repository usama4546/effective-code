package com.example.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.view.View;
import android.widget.TextView;

public class display extends AppCompatActivity {

    TextView countTV1;
    int count = 0,count1 = 0,count2 = 0,countt=0;
    private int login;
    TextView countTV2;
    TextView countTV3;
    TextView countTV5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        countTV1 = findViewById(R.id.count1);
        countTV2= findViewById(R.id.count2);
        countTV3= findViewById(R.id.count3);
        countTV5= findViewById(R.id.gtotal);

    }




    public void inc1BtnClicked (View view) {

        count++;
        countTV1.setText(""+count);
    }

    public void dic1BtnClicked( View view) {
        while(count>0)
        count--;
        countTV1.setText(""+count);
    }

    public void inc2BtnClicked (View view) {
        count1++;
        countTV2.setText(""+count1);
    }

    public void dic2BtnClicked( View view) {
        while(count1>0)
        count1--;
        countTV2.setText(""+count1);
    }

    public void inc3BtnClicked (View view) {
        count2++;
        countTV3.setText(""+count2);
    }

    public void dic3BtnClicked( View view) {
        while(count2>0)
        count2--;
        countTV3.setText(""+count2);
    }

    public void totalBtnClicked( View view) {
        countt=((count*8000)+(count1*4000)+(count2*3000));
        countTV5.setText(""+countt);
    }


    public void display(View view) {
        Intent i =new Intent(display.this,MainActivity.class);
        startActivity(i);
    }

    private void checkvalue() {
        SharedPreferences Settings1 = getSharedPreferences("Begining",0);
        login = settings1.getInt("SNOW",0);
    }

    }

