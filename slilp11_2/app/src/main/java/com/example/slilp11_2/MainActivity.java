package com.example.slilp11_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText fn,sn,ln,dob,add,email;
private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    fn=findViewById(R.id.fname);
    sn=findViewById(R.id.sname);
    ln=findViewById(R.id.lname);
    dob=findViewById(R.id.dob);
    add=findViewById(R.id.address);
    email=findViewById(R.id.email);
    btn=findViewById(R.id.button);
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String fname=fn.getText().toString();
            String sname=sn.getText().toString();
            String lname=ln.getText().toString();
            String daob=dob.getText().toString();
            String address=add.getText().toString();
            String Email=email.getText().toString();
            if(fname.isEmpty() || lname.isEmpty() || sname.isEmpty() || daob.isEmpty() || address.isEmpty() | Email.isEmpty())
            {
                Toast.makeText(MainActivity.this, "Enter All Detail", Toast.LENGTH_SHORT).show();
            }
            else{
            Intent i=new Intent(MainActivity.this,MainActivity2.class);
            i.putExtra("fname",fname);
            i.putExtra("sname",sname);
            i.putExtra("lname",lname);
            i.putExtra("dob",daob);
            i.putExtra("address",address);
            i.putExtra("Email",Email);
            startActivity(i);
            }
        }
    });

    }
}