package com.example.optionmenueg;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()) {
            case R.id.setting:
                Toast.makeText(this, "First Item Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.search:
                Toast.makeText(this, "Second Item Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.bca :
                Toast.makeText(this, "First SubItem Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.bbs :
                Toast.makeText(this, "Second SubItem Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.share:
                Toast.makeText(this, "Third Item Selected", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
