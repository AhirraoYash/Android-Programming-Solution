package com.example.slip12_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatePicker date=findViewById(R.id.dp);
        TimePicker time=findViewById(R.id.tp);
        Button btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int day=date.getDayOfMonth();
                int month=date.getMonth();
                int year=date.getYear();
                int hour=time.getHour();
                int min=time.getMinute();
                Calendar cal=Calendar.getInstance();
                cal.set(day,month,year,hour,min);
                String dateTime=cal.getTime().toString();
                Toast.makeText(MainActivity.this, dateTime, Toast.LENGTH_SHORT).show();
            }
        });
    }
}