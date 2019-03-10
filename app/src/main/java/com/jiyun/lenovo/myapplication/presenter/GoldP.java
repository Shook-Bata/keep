package com.jiyun.lenovo.myapplication.presenter;

import com.jiyun.lenovo.myapplication.Base.BasePresenter;
import com.jiyun.lenovo.myapplication.Model.GoldM;

/**
 * Created by Lenovo on 2019/3/6.
 */

public class GoldP extends BasePresenter {


    private GoldM mGoldM;

    @Override
    protected void initModel() {
        mGoldM = new GoldM();
    }
}
