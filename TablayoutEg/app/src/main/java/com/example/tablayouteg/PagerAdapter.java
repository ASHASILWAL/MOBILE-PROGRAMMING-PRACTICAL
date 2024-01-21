package com.example.tablayouteg;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter  extends FragmentPagerAdapter {


    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch(i){
            case 0 :
                return new Fragment1();

            case 1 :
                return new Fragment2();

            case 2 :
                return new Fragment3();

            default :
                return new Fragment1();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        String title = null;
        if(position == 0)
        {
            title = "Chat";
        }

        else if(position == 1)
        {
            title = "Message";
        }

        else if(position == 2)
        {
            title = "Contact";
        }

        else {
            return title;
        }

        return super.getPageTitle(position);
    }
}
