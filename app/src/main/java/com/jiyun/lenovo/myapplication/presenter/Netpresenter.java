package com.jiyun.lenovo.myapplication.presenter;

import com.jiyun.lenovo.myapplication.Base.BasePresenter;
import com.jiyun.lenovo.myapplication.Model.netModel;
import com.jiyun.lenovo.myapplication.View.netView;

/**
 * Created by Lenovo on 2019/3/9.
 */

public class Netpresenter  extends BasePresenter<netView>{

    private netModel mNetModel;

    @Override
    protected void initModel() {
        mNetModel = new netModel();
    }
}
