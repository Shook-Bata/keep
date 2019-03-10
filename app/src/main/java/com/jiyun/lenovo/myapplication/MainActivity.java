package com.jiyun.lenovo.myapplication;

import android.support.v4.app.Fragment;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.jiyun.lenovo.myapplication.Base.BaseActivity;
import com.jiyun.lenovo.myapplication.Fragment.Aboutfragment;
import com.jiyun.lenovo.myapplication.Fragment.DailynewsFragment;
import com.jiyun.lenovo.myapplication.Fragment.Gankfragment;
import com.jiyun.lenovo.myapplication.Fragment.Goldfragment;
import com.jiyun.lenovo.myapplication.Fragment.Likefragment;
import com.jiyun.lenovo.myapplication.Fragment.Settingfragment;
import com.jiyun.lenovo.myapplication.Fragment.V2EXfragment;
import com.jiyun.lenovo.myapplication.Fragment.Wechatfragment;
import com.jiyun.lenovo.myapplication.Fragment.ZhihuDailynewsitemfragment;
import com.jiyun.lenovo.myapplication.View.netView;
import com.jiyun.lenovo.myapplication.presenter.Netpresenter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity<netView, Netpresenter> {
    private static  int TYPE_ZHIHU = 0;
    private static  int TYPE_WECHAT = 1;
    private static  int TYPE_GANK = 2;
    private static  int TYPE_GOLD = 3;
    private static  int TYPE_V2EX = 4;
    private static  int TYPE_LIKE = 5;
    private static  int TYPE_SETTING = 6;
    private static  int TYPE_ABOUT = 7;

    @BindView(R.id.tv_title)
    TextView mTvTitle;
    @BindView(R.id.tob)
    Toolbar mTob;
    @BindView(R.id.fram)
    FrameLayout mFram;
    @BindView(R.id.nav)
    NavigationView mNav;
    @BindView(R.id.dl)
    DrawerLayout mDl;
    private ArrayList<Integer> mList;
    private ArrayList<Fragment> mFragments;
    private FragmentManager mManager;
    private int mLastposition;

    @Override
    protected Netpresenter initpresenter() {
        return new Netpresenter();
    }

    @Override
    public void initlistener() {
        mNav.setItemIconTintList(null);
        mNav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                item.setChecked(true);
                switch (item.getItemId()) {
                    case R.id.zhihu:
                        switchfragment(TYPE_ZHIHU);
                        break;
                    case R.id.wechat:
                        switchfragment(TYPE_WECHAT);
                        break;
                    case R.id.gank:
                        switchfragment(TYPE_GANK);
                        break;
                    case R.id.gold:
                        switchfragment(TYPE_GOLD);
                        break;
                    case R.id.V2EX:
                        switchfragment(TYPE_V2EX);
                        break;
                    case R.id.like:
                        switchfragment(TYPE_LIKE);
                        break;
                    case R.id.setting:
                        switchfragment(TYPE_SETTING);
                        break;
                    case R.id.about:
                        switchfragment(TYPE_ABOUT);
                        break;
                }
                mDl.closeDrawer(Gravity.LEFT);
                return false;
            }
        });
    }

    @Override
    public void initview() {
        super.initview();
        mManager = getSupportFragmentManager();
        mTob.setTitle("");
        setSupportActionBar(mTob);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDl, mTob, R.string.app_name, R.string.app_name);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        mDl.addDrawerListener(toggle);
        toggle.syncState();
        inittitle();
        initfragment();
        addshowfragment();
    }

    private void addshowfragment() {
        mTvTitle.setText(mList.get(0));
        FragmentTransaction transaction = mManager.beginTransaction();
        transaction.add(R.id.fram,mFragments.get(0));
        transaction.commit();
    }

    private void initfragment() {
        mFragments = new ArrayList<>();
        mFragments.add(new DailynewsFragment());
        mFragments.add(new Wechatfragment());
        mFragments.add(new Gankfragment());
        mFragments.add(new Goldfragment());
        mFragments.add(new V2EXfragment());
        mFragments.add(new Likefragment());
        mFragments.add(new Settingfragment());
        mFragments.add(new Aboutfragment());
    }

    private void inittitle() {
        mList = new ArrayList<>();
        mList.add(R.string.Zhihu);
        mList.add(R.string.wechat);
        mList.add(R.string.gank);
        mList.add(R.string.gold);
        mList.add(R.string.V2EX);
        mList.add(R.string.like);
        mList.add(R.string.setting);
        mList.add(R.string.about);
    }

    private void switchfragment(int typeZhihu) {
        mTvTitle.setText(mList.get(typeZhihu));
        FragmentTransaction transaction = mManager.beginTransaction();
        Fragment fragment = mFragments.get(typeZhihu);
        if (!fragment.isAdded()){
            transaction.add(R.id.fram,fragment);
        }
        Fragment fragment1 = mFragments.get(mLastposition);
        transaction.hide(fragment1);
        transaction.show(fragment);
        transaction.commit();
        mLastposition = typeZhihu;
    }

    @Override
    protected int initlayoutid() {
        return R.layout.activity_main;
    }
}
