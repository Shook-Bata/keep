package com.jiyun.lenovo.myapplication.Fragment;

import com.jiyun.lenovo.myapplication.Base.Basefragment;
import com.jiyun.lenovo.myapplication.R;
import com.jiyun.lenovo.myapplication.View.ZhihuzhutiV;
import com.jiyun.lenovo.myapplication.presenter.ZhihuzhutiP;

/**
 * Created by Lenovo on 2019/3/6.
 */

public class Zhihuzhutifragment extends Basefragment<ZhihuzhutiV,ZhihuzhutiP> implements ZhihuzhutiV {


    @Override
    protected ZhihuzhutiP initpresenter() {
        return new ZhihuzhutiP();
    }

    @Override
    protected int initlayputid() {
        return R.layout.item_zhuti;
    }
}
