package com.vedran.tabbedmenu;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private String[] fragmentTitles;
    private String[] fragmentClasses;

   private Context context;

    public ViewPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;

        initConfig();
    }

    private void initConfig() {
        fragmentTitles = context.getResources().getStringArray(R.array.fragment_titles);
        fragmentClasses = context.getResources().getStringArray(R.array.fragment_classes);
    }

    @Override
    public Fragment getItem(int position) {
        return Fragment.instantiate(context, fragmentClasses[position]);
    }

    @Override
    public int getCount() {
        return fragmentTitles.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitles[position];
    }
}
