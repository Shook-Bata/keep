package com.jiyun.lenovo.myapplication.Fragment;

import com.jiyun.lenovo.myapplication.Base.Basefragment;
import com.jiyun.lenovo.myapplication.R;
import com.jiyun.lenovo.myapplication.View.GoldV;
import com.jiyun.lenovo.myapplication.presenter.GoldP;

/**
 * Created by Lenovo on 2019/3/6.
 */

public class Goldfragment extends Basefragment<GoldV,GoldP> implements GoldV {


    @Override
    protected GoldP initpresenter() {
        return new GoldP();
    }

    @Override
    protected int initlayputid() {
        return R.layout.item_gold;
    }


}
