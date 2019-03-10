package com.jiyun.lenovo.myapplication.presenter;

import com.jiyun.lenovo.myapplication.Base.BasePresenter;
import com.jiyun.lenovo.myapplication.Model.SettingM;

/**
 * Created by Lenovo on 2019/3/6.
 */

public class SettingP extends BasePresenter {


    private SettingM mSettingM;

    @Override
    protected void initModel() {
        mSettingM = new SettingM();
    }
}
