package com.jiyun.lenovo.myapplication.Fragment;

import com.jiyun.lenovo.myapplication.Base.Basefragment;
import com.jiyun.lenovo.myapplication.R;
import com.jiyun.lenovo.myapplication.View.V2EXV;
import com.jiyun.lenovo.myapplication.presenter.V2EXP;

/**
 * Created by Lenovo on 2019/3/6.
 */

public class V2EXfragment extends Basefragment<V2EXV,V2EXP> implements V2EXV {


    @Override
    protected V2EXP initpresenter() {
        return new V2EXP();
    }

    @Override
    protected int initlayputid() {
        return R.layout.item_v2ex;
    }
}
