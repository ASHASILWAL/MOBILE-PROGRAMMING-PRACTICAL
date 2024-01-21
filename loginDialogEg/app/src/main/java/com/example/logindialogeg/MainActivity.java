package com.example.logindialogeg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openDialog();

            }
        });

        }
    public void openDialog(){

        loginDialogFragment loginDialogFragments = new loginDialogFragment();
        loginDialogFragments.show(getSupportFragmentManager(), "login dialog");

    }
}