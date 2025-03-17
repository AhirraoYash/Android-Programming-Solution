package com.example.slip19_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView name,weight,gweight,height,age,phone,address,gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name=findViewById(R.id.name);
        weight=findViewById(R.id.weight);
        gweight=findViewById(R.id.gweight);
        height=findViewById(R.id.height);
        age=findViewById(R.id.age);
        phone=findViewById(R.id.phone);
        address=findViewById(R.id.address);
        gender=findViewById(R.id.gender);
        Intent i=getIntent();
        String n=i.getStringExtra("name");
        String w=i.getStringExtra("weight");
        String a=i.getStringExtra("age");
        String p=i.getStringExtra("phone");
        String add=i.getStringExtra("address");
        String gw=i.getStringExtra("gweight");
        String h=i.getStringExtra("height");
        String g=i.getStringExtra("gender");
        name.setText("Name :"+n);
        weight.setText("Weight : "+w);
        age.setText("Age : "+a);
        phone.setText("Phone : "+p);
        address.setText("Address :"+add);
        gweight.setText("gail weight : "+gw);
        height.setText("Height : "+h);
        gender.setText("Gender : "+g);
    }
}