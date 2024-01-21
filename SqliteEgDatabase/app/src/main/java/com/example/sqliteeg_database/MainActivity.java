package com.example.sqliteeg_database;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listContactView;
    private List<Contact> Listcontact;
    private ArrayAdapter<Contact> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listContactView = findViewById(R.id.listContactView);
        Listcontact = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Listcontact);


        DbHelper dbHelper = new DbHelper(this);

        dbHelper.dbinsert(new Contact("Samjhana Timalsina", "9876543210"));
        dbHelper.dbinsert(new Contact("Kailash Maharjan", "9876543211"));
        dbHelper.dbinsert(new Contact("Anjana Maharjan", "9876543212"));
        dbHelper.dbinsert(new Contact("Samjhana Silwal", "9876543213"));
        dbHelper.dbinsert(new Contact("Swechha Bista", "9876543214"));
        dbHelper.dbinsert(new Contact("Puja Thapa", "9876543215"));
        dbHelper.dbinsert(new Contact("Asha Silwal", "9876543216"));
        dbHelper.dbinsert(new Contact("Bipin Ghimire", "9876543217"));
        dbHelper.dbinsert(new Contact("Bibek Ghimire  ", "9876543218"));


       Listcontact.addAll(DbHelper.getAllContacts(this));
       adapter.notifyDataSetChanged();
       
       
       //delete items
        
//        listContactView.setOnClickListener((parent, view, position, id)) -> {
//
//          Contact selectedContact = Listcontact.get(position);
//          dbHelper.deleteContact(selectedContact.getId());
//          Listcontact.remove(position);
//            adapter.notifyDataSetChanged();
//            android.widget.Toast.makeText(, "", Toast.LENGTH_SHORT).show();
//
//        });
//
listContactView.setAdapter(adapter);

    }
}