package com.example.databackpassingeg;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private TextView txt1;
    private EditText edt1, edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        btn1 = findViewById(R.id.btn1);
        txt1 = findViewById(R.id.txt1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num1 = Integer.parseInt(edt1.getText().toString());
                int num2 = Integer.parseInt(edt2.getText().toString());

                Intent i = new Intent(MainActivity.this, MainActivity2.class);

                i.putExtra("num1", num1);
                i.putExtra("num2", num2);

                startActivityForResult(i, 1);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                int result = data.getIntExtra("result", 0);
                txt1.setText(String.valueOf(result));
            }

            else{
                txt1.setText("nothing selected");
            }
        }
    }
}