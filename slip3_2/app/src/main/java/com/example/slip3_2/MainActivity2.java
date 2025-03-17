package com.example.slip3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView n,s,g,h,m,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        n=findViewById(R.id.name);
        s=findViewById(R.id.surname);
        g=findViewById(R.id.Gender);
        h=findViewById(R.id.Hobbies);
        c=findViewById(R.id.Class);
        m=findViewById(R.id.Mark);
        Intent i=getIntent();
        n.setText("Name : "+i.getStringExtra("name"));
        s.setText("Surname : "+i.getStringExtra("surname"));
        g.setText("Gender : "+i.getStringExtra("gender"));
        c.setText("Class : "+i.getStringExtra("Class"));
        h.setText("Hobbies : "+i.getStringExtra("hobbies"));
        m.setText("Marks : "+i.getStringExtra("mark"));

    }
}