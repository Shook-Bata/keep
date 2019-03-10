package com.jiyun.lenovo.myapplication.Fragment;

import com.jiyun.lenovo.myapplication.Base.Basefragment;
import com.jiyun.lenovo.myapplication.R;
import com.jiyun.lenovo.myapplication.View.LikeV;
import com.jiyun.lenovo.myapplication.presenter.LikeP;

/**
 * Created by Lenovo on 2019/3/6.
 */

public class Likefragment extends Basefragment<LikeV,LikeP> implements LikeV {


    @Override
    protected LikeP initpresenter() {
        return new LikeP();
    }

    @Override
    protected int initlayputid() {
        return R.layout.item_like;
    }
}
