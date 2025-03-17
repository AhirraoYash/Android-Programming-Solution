package com.example.slip3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText n,s,g,h,m,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n=findViewById(R.id.name);
        s=findViewById(R.id.surname);
        g=findViewById(R.id.Gender);
        h=findViewById(R.id.Hobbies);
        c=findViewById(R.id.Class);
        m=findViewById(R.id.Mark);
        Button btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=n.getText().toString();
                String surname=s.getText().toString();
                String gender=g.getText().toString();
                String hobbies=h.getText().toString();
                String Class=c.getText().toString();
                String mark=m.getText().toString();
                if(name.isEmpty() || surname.isEmpty() || gender.isEmpty() || hobbies.isEmpty() || Class.isEmpty() || mark.isEmpty()){
                    Toast.makeText(MainActivity.this, "Fill all detail", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent i=new Intent(MainActivity.this,MainActivity2.class);
                    i.putExtra("name",name);
                    i.putExtra("surname",surname);
                    i.putExtra("gender",name);
                    i.putExtra("hobbies",hobbies);
                    i.putExtra("Class",Class);
                    i.putExtra("mark",mark);
                    startActivity(i);
                }
            }
        });
    }
}