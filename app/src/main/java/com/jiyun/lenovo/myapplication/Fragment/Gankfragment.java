package com.jiyun.lenovo.myapplication.Fragment;

import com.jiyun.lenovo.myapplication.Base.Basefragment;
import com.jiyun.lenovo.myapplication.R;
import com.jiyun.lenovo.myapplication.View.GankV;
import com.jiyun.lenovo.myapplication.presenter.GankP;

/**
 * Created by Lenovo on 2019/3/6.
 */

public class Gankfragment extends Basefragment<GankV,GankP> implements GankV {


    @Override
    protected GankP initpresenter() {
        return new GankP();
    }

    @Override
    protected int initlayputid() {
        return R.layout.item_gank;
    }
}
