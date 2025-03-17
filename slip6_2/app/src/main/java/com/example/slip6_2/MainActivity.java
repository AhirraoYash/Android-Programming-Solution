package com.example.slip6_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String str[]={"a","b","c"};
        ListView i=findViewById(R.id.list);
        ArrayAdapter<String> ad=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,str);
        i.setAdapter(ad);
        i.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView parent,View view,int position,long id){
                Toast.makeText(MainActivity.this, "selected item :"+str[position], Toast.LENGTH_SHORT).show();
            }
        });

    }
}