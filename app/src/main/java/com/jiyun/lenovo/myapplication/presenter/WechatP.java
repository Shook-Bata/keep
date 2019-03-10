package com.jiyun.lenovo.myapplication.presenter;

import com.jiyun.lenovo.myapplication.Base.BasePresenter;
import com.jiyun.lenovo.myapplication.Model.WechatM;

/**
 * Created by Lenovo on 2019/3/6.
 */

public class WechatP extends BasePresenter {


    private WechatM mWechatM;

    @Override
    protected void initModel() {
        mWechatM = new WechatM();
    }
}
