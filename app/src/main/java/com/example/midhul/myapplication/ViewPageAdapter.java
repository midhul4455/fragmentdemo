package com.example.midhul.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Midhul on 16-02-2018.
 */

public class ViewPageAdapter extends FragmentPagerAdapter {


    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> FragmentListTitles = new ArrayList<>();
    public ViewPageAdapter(FragmentManager fm) {

        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return FragmentListTitles.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return FragmentListTitles.get(position);
    }
     public void AddFragment(Fragment fragment, String Title ){
        fragmentList.add(fragment);
        FragmentListTitles.add(Title);
    }
}
