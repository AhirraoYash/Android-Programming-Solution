package com.example.slip18_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       // menu.add(Menu.NONE,1,Menu.NONE,"factorial");
        //menu.add(Menu.NONE,2,Menu.NONE,"sum");
        return super.onCreateOptionsMenu(menu);
    }

}