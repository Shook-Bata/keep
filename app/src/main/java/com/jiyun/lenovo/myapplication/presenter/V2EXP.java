package com.jiyun.lenovo.myapplication.presenter;

import com.jiyun.lenovo.myapplication.Base.BasePresenter;
import com.jiyun.lenovo.myapplication.Model.V2EXM;

/**
 * Created by Lenovo on 2019/3/6.
 */

public class V2EXP extends BasePresenter {


    private V2EXM mV2EXM;

    @Override
    protected void initModel() {
        mV2EXM = new V2EXM();
    }
}
