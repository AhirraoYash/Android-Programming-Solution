package com.example.slip14_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt=findViewById(R.id.txt);
        sp=(Spinner)findViewById(R.id.spinner);
        String[] coffee={"Filter","Americano","Latte","Espresso","Cappucino","Mocha","Skinny Latte","Espresso correto"};
        ArrayAdapter<String> ad=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item,coffee);
        sp.setAdapter(ad);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            public void onItemSelected(AdapterView parent, View v,int position,long id){
                txt.setText(coffee[position]);

            }
            public void onNothingSelected(AdapterView parent){

            }
        });
    }
}