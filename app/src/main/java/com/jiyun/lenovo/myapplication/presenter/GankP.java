package com.jiyun.lenovo.myapplication.presenter;

import com.jiyun.lenovo.myapplication.Base.BasePresenter;
import com.jiyun.lenovo.myapplication.Model.GankM;

/**
 * Created by Lenovo on 2019/3/6.
 */

public class GankP extends BasePresenter {


    private GankM GankM;

    @Override
    protected void initModel() {
        GankM = new GankM();
    }
}
