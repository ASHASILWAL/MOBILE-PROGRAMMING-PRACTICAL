package com.example.datapassingeg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private EditText edt1;
    private EditText edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = edt1.getText().toString();
                String address = edt2.getText().toString();

               Intent i =  new Intent(MainActivity.this, MainActivity2.class);

               i.putExtra("name", name);
               i.putExtra("address", address);

                        startActivity(i);

            }
        });

    }
}