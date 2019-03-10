package com.jiyun.lenovo.myapplication.Fragment;

import com.jiyun.lenovo.myapplication.Base.Basefragment;
import com.jiyun.lenovo.myapplication.R;
import com.jiyun.lenovo.myapplication.View.ZhihucolumnV;
import com.jiyun.lenovo.myapplication.presenter.ZhihucolumnP;

/**
 * Created by Lenovo on 2019/3/6.
 */

public class Zhihucolumnfragment extends Basefragment<ZhihucolumnV,ZhihucolumnP> implements ZhihucolumnV {


    @Override
    protected ZhihucolumnP initpresenter() {
        return new ZhihucolumnP();
    }

    @Override
    protected int initlayputid() {
        return R.layout.item_column;
    }
}
