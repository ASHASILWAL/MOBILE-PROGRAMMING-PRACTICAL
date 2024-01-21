package com.example.dynamicfragmenteg;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3 ;
    LinearLayout linear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        linear = findViewById(R.id.linear);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AFragment a = new AFragment();
                FragmentTransaction ft1 = getSupportFragmentManager().beginTransaction();

                ft1.replace(R.id.linear,a);

                ft1.commit();
            }
        });

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        BFragment b = new BFragment();
                        FragmentTransaction ft2 = getSupportFragmentManager().beginTransaction();

                        ft2.replace(R.id.linear,b);

                        ft2.commit();

                    }
                });

                btn3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        CFragment c = new CFragment();
                        FragmentTransaction ft3 = getSupportFragmentManager().beginTransaction();

                        ft3.replace(R.id.linear,c);

                        ft3.commit();
                    }
                });



    }
}