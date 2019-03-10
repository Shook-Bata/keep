package com.jiyun.lenovo.myapplication.presenter;

import com.jiyun.lenovo.myapplication.Base.BasePresenter;
import com.jiyun.lenovo.myapplication.Model.ZhihuzhutiM;

/**
 * Created by Lenovo on 2019/3/6.
 */

public class ZhihuzhutiP extends BasePresenter {


    private ZhihuzhutiM mZhihuzhutiM;

    @Override
    protected void initModel() {
        mZhihuzhutiM = new ZhihuzhutiM();
    }

}
