package com.jiyun.lenovo.myapplication.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Lenovo on 2019/3/10.
 */

public class Vpadapter extends FragmentPagerAdapter {
    private final Context mContext;
    private final ArrayList<Integer> mList;
    private final ArrayList<Fragment> mFragments;

    public Vpadapter(Context context, FragmentManager childFragmentManager, ArrayList<Integer> list, ArrayList<Fragment> fragments) {
        super(childFragmentManager);
        mContext = context;
        mList = list;
        mFragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(mList.get(position));
    }
}
