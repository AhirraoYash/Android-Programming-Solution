package com.example.slip1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
private Button btn;
private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        txt=findViewById(R.id.textView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    showDateDialog();
            }
        });
    }
    void showDateDialog(){
        final Calendar cal=Calendar.getInstance();
        int Year=cal.get(Calendar.YEAR);
        int Month=cal.get(Calendar.MONTH);
        int Day=cal.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog dp=new DatePickerDialog(this,new DatePickerDialog.OnDateSetListener(){
            public void onDateSet(DatePicker view,int year,int month,int day){
                txt.setText(day  + "/" + month + "/" + Year);
            }
        },Year,Month,Day);
        dp.show();

    }
}