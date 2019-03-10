package com.jiyun.lenovo.myapplication.Fragment;

import com.jiyun.lenovo.myapplication.Base.Basefragment;
import com.jiyun.lenovo.myapplication.R;
import com.jiyun.lenovo.myapplication.View.WechatV;
import com.jiyun.lenovo.myapplication.presenter.WechatP;

/**
 * Created by Lenovo on 2019/3/6.
 */

public class Wechatfragment extends Basefragment<WechatV,WechatP> implements WechatV {


    @Override
    protected WechatP initpresenter() {
        return new WechatP();
    }

    @Override
    protected int initlayputid() {
        return R.layout.item_wechat;
    }
}
