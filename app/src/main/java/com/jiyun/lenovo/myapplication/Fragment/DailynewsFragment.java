package com.jiyun.lenovo.myapplication.Fragment;

import android.support.v4.app.Fragment;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.jiyun.lenovo.myapplication.Base.Basefragment;
import com.jiyun.lenovo.myapplication.R;
import com.jiyun.lenovo.myapplication.View.DailynewsV;
import com.jiyun.lenovo.myapplication.View.DailynewsitemV;
import com.jiyun.lenovo.myapplication.adapter.Vpadapter;
import com.jiyun.lenovo.myapplication.presenter.DailynewsP;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.Unbinder;

/**
 * Created by Lenovo on 2019/3/6.
 */

public class DailynewsFragment extends Basefragment<DailynewsitemV, DailynewsP> implements DailynewsV {


    @BindView(R.id.tab)
    TabLayout mTab;
    @BindView(R.id.vp)
    ViewPager mVp;
    private View view;
    private Unbinder unbinder;
    private ArrayList<Fragment> mFragments;
    private ArrayList<Integer> mList;
    private Vpadapter mVpadapter;

    @Override
    protected DailynewsP initpresenter() {
        return new DailynewsP();
    }

    @Override
    protected int initlayputid() {
        return R.layout.item_dailynews;
    }
    public void initview() {
        inittitle();
        initfragment();
        mVpadapter = new Vpadapter(getContext(),getChildFragmentManager(),mList,mFragments);
        mVp.setAdapter(mVpadapter);
        mTab.setupWithViewPager(mVp);
    }

    private void initfragment() {
        mFragments = new ArrayList<>();
        mFragments.add(new ZhihuDailynewsitemfragment());
        mFragments.add(new Zhihuzhutifragment());
        mFragments.add(new Zhihucolumnfragment());
        mFragments.add(new ZhihuHotfragment());
    }

    private void inittitle() {
        mList = new ArrayList<>();
        mList.add(R.string.ribao);
        mList.add(R.string.theme);
        mList.add(R.string.column);
        mList.add(R.string.Hot);
    }

}
