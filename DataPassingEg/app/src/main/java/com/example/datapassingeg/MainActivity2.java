package com.example.datapassingeg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView txt1, txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);

        String name =  getIntent ().getStringExtra("name");
        String address = getIntent().getStringExtra("address");

        txt1.setText(name);
        txt2.setText(address);

    }
}