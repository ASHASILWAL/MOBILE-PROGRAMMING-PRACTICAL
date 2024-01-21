package com.example.contextmenueg;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txt;

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.context_menu, menu);

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){

            case R.id.home :
                Toast.makeText(this, "Clicked home", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.about :
                Toast.makeText(this, "Clicked about", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.resource :
                Toast.makeText(this, "Clicked resource", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.contact :
                Toast.makeText(this, "Clicked contact", Toast.LENGTH_SHORT).show();
                return true;

            default :
                return super.onContextItemSelected(item);


        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.txt);

        registerForContextMenu(txt);



    }
}