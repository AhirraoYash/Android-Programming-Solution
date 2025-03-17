package com.example.slip19_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText name,weight,gweight,height,age,phone,address;
private CheckBox cb;
private RadioGroup rg;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    name=findViewById(R.id.name);
    weight=findViewById(R.id.weight);
    gweight=findViewById(R.id.gaol);
    height=findViewById(R.id.height);
    age=findViewById(R.id.age);
    phone=findViewById(R.id.number);
    address=findViewById(R.id.address);
    cb=findViewById(R.id.checkbox);
    rg=findViewById(R.id.rg);
        Button btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            String n=name.getText().toString();
                String w=weight.getText().toString();
                String wg=gweight.getText().toString();
                String h=height.getText().toString();
                String a=age.getText().toString();
                String p=phone.getText().toString();
                String add=address.getText().toString();
                if(n.isEmpty() || w.isEmpty() || wg.isEmpty() || h.isEmpty() || a.isEmpty() || p.isEmpty() || add.isEmpty()){
                    Toast.makeText(MainActivity.this, "Fill Full Detail", Toast.LENGTH_SHORT).show();
                }else if(cb.isChecked()){
                    Intent i=new Intent(MainActivity.this, MainActivity2.class);
                    i.putExtra("name",n);
                    i.putExtra("weight",w);
                    i.putExtra("gweight",wg);
                    i.putExtra("height",h);
                    i.putExtra("age",a);
                    i.putExtra("phone",p);
                    i.putExtra("address",add);
                    rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                        public void onCheckedChanged(RadioGroup rg,int CheckId){
                             RadioButton btn=findViewById(CheckId);
                             String str=btn.getText().toString();
                        }
                    });

                    i.putExtra("gender",str);
                    startActivity(i);
                }
                else{
                    Toast.makeText(MainActivity.this, "Click on CheckBox"+str, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}