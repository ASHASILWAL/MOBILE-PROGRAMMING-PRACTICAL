package com.example.listviewbyspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> arrString = new ArrayList<>();

        spinner = findViewById(R.id.spinner);

        arrString.add("Anjana");
        arrString.add("Samjhana1");
        arrString.add("Kailash");
        arrString.add("Samjhana2");
        arrString.add("Swechha");
        arrString.add("Bibek");
        arrString.add("Asha");
        arrString.add("Bipin");
        arrString.add("Umang");
        arrString.add("Puja");
        arrString.add("Shiva");
        arrString.add("Ranjana");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item, arrString);

    }
}