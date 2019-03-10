package com.jiyun.lenovo.myapplication.Fragment;

import com.jiyun.lenovo.myapplication.Base.Basefragment;
import com.jiyun.lenovo.myapplication.R;
import com.jiyun.lenovo.myapplication.View.AboutV;
import com.jiyun.lenovo.myapplication.presenter.AboutP;

/**
 * Created by Lenovo on 2019/3/6.
 */

public class Aboutfragment extends Basefragment<AboutV,AboutP> implements AboutV {


    @Override
    protected AboutP initpresenter() {
        return new AboutP();
    }

    @Override
    protected int initlayputid() {
        return R.layout.item_about;
    }
}
