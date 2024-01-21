package com.example.tablayouteg;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TabLayout tab;
    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tab = findViewById(R.id.tab);
        pager = findViewById(R.id.pager);

        pager.setAdapter(new PagerAdapter(getSupportFragmentManager()));

        tab.setupWithViewPager(pager);

    }
}