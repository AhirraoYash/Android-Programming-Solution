package com.example.slilp11_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView fn,sn,ln,dob,add,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        fn=findViewById(R.id.fname);
        sn=findViewById(R.id.sname);
        ln=findViewById(R.id.lname);
        dob=findViewById(R.id.dob);
        add=findViewById(R.id.address);
        email=findViewById(R.id.email);
        Intent i=getIntent();
        String fname=i.getStringExtra("fname");
        String sname=i.getStringExtra("sname");
        String lname=i.getStringExtra("lname");
        String daob=i.getStringExtra("dob");
        String address=i.getStringExtra("address");
        String Email=i.getStringExtra("email");
        fn.setText(fname);
        sn.setText(sname);
        ln.setText(lname);
        dob.setText(daob);
        add.setText(address);
        email.setText(Email);

    }
}