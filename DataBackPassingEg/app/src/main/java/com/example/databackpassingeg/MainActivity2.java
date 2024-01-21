package com.example.databackpassingeg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        final int num1 = i.getIntExtra("num1", 0);
        final int num2 = i.getIntExtra("num2", 0);

        TextView t1 = findViewById(R.id.t1);
        Button b1 = findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int result = num1 + num2 ;

                Intent intent  = new Intent();
                intent.putExtra("result", result);

                setResult(RESULT_OK,intent);
                finish();

            }
        });


    }
}