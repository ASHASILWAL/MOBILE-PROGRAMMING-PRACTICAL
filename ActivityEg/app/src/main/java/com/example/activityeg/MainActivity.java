package com.example.activityeg;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);


  btn1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          Intent i = new Intent(MainActivity.this, MainActivity2.class);
          startActivity(i);
      }
  });
    }
}