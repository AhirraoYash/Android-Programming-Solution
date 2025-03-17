package com.example.slip17_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.button);
        registerForContextMenu(btn);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
       // getMenuInflater().inflate(R.menu.cmenu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Options");
        menu.add(Menu.NONE,1, Menu.NONE,"factoral");
        menu.add(Menu.NONE,2,Menu.NONE,"sum of digits");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int itemid;
        itemid=item.getItemId();
        if(itemid==1){
            Toast.makeText(this, "this is yash", Toast.LENGTH_SHORT).show();
        }
        if(itemid==2){
            Toast.makeText(this, "This is vaibhav", Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);
    }
}