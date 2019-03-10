package com.jiyun.lenovo.myapplication.Fragment;

import com.jiyun.lenovo.myapplication.Base.Basefragment;
import com.jiyun.lenovo.myapplication.R;
import com.jiyun.lenovo.myapplication.View.SettingV;
import com.jiyun.lenovo.myapplication.presenter.SettingP;

/**
 * Created by Lenovo on 2019/3/6.
 */

public class Settingfragment extends Basefragment<SettingV,SettingP> implements SettingV {


    @Override
    protected SettingP initpresenter() {
        return null;
    }

    @Override
    protected int initlayputid() {
        return R.layout.item_setting;
    }
}
