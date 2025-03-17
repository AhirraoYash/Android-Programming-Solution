package com.example.slip5_2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText txt=findViewById(R.id.editText);
        Button btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String str=txt.getText().toString();
                AlertDialog.Builder ag=new AlertDialog.Builder(MainActivity.this);
                ag.setTitle("Friend Name");
                ag.setMessage("Friend Name : "+str);
                ag.setPositiveButton("ok",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog,int which){
                    //when button is click
                    }
                });
                ag.show();
            }
        });
    }
}