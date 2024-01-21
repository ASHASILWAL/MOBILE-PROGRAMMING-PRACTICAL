package com.example.recyclervieweg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Create a arraylist of contactmodel datatype
    ArrayList<ContactModel> arrContact = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.contactRecycler);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //now we add data items

        arrContact.add(new ContactModel(R.drawable.guessb1, "Samjhana", "9876543210"));
        arrContact.add(new ContactModel(R.drawable.guessb2, "Swechha", "9876543211"));
        arrContact.add(new ContactModel(R.drawable.guessb3, "Asha", "9876543212"));
        arrContact.add(new ContactModel(R.drawable.guess02, "Puja", "9876543212"));
        arrContact.add(new ContactModel(R.drawable.guessh1, "Umang", "9876543213"));
        arrContact.add(new ContactModel(R.drawable.guessh2, "kailash", "9876543214"));
        arrContact.add(new ContactModel(R.drawable.guessh3, "Bipin", "9876543215"));
        arrContact.add(new ContactModel(R.drawable.guessb1, "Samjhana", "9876543210"));
        arrContact.add(new ContactModel(R.drawable.guessb2, "Swechha", "9876543211"));
        arrContact.add(new ContactModel(R.drawable.guessb3, "Asha", "9876543212"));
        arrContact.add(new ContactModel(R.drawable.guess02, "Puja", "9876543212"));
        arrContact.add(new ContactModel(R.drawable.guessh1, "Umang", "9876543213"));
        arrContact.add(new ContactModel(R.drawable.guessh2, "kailash", "9876543214"));
        arrContact.add(new ContactModel(R.drawable.guessh3, "Bipin", "9876543215"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arrContact);
        recyclerView.setAdapter(adapter);
    }
}