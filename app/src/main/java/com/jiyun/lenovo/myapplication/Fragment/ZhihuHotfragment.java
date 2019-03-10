package com.jiyun.lenovo.myapplication.Fragment;

import com.jiyun.lenovo.myapplication.Base.Basefragment;
import com.jiyun.lenovo.myapplication.R;
import com.jiyun.lenovo.myapplication.View.ZhihuHotV;
import com.jiyun.lenovo.myapplication.presenter.ZhihuHotP;

/**
 * Created by Lenovo on 2019/3/6.
 */

public class ZhihuHotfragment extends Basefragment<ZhihuHotV,ZhihuHotP> implements ZhihuHotV {


    @Override
    protected ZhihuHotP initpresenter() {
        return new ZhihuHotP();
    }

    @Override
    protected int initlayputid() {
        return R.layout.item_hot;
    }
}
