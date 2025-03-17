package com.example.slip15_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText email=findViewById(R.id.email);
        EditText password=findViewById(R.id.pass);
        Button btn=findViewById(R.id.submit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e=email.getText().toString();
                String p=password.getText().toString();
                if(e.isEmpty() || p.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter Email id and Password", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent i=new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(i);
                }
            }
        });
    }
}