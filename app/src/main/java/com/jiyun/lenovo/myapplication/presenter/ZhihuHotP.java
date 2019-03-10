package com.jiyun.lenovo.myapplication.presenter;

import com.jiyun.lenovo.myapplication.Base.BasePresenter;
import com.jiyun.lenovo.myapplication.Model.ZhihuHotM;

/**
 * Created by Lenovo on 2019/3/6.
 */

public class ZhihuHotP extends BasePresenter {

    private ZhihuHotM mZhihuHotM;

    @Override
    protected void initModel() {
        mZhihuHotM = new ZhihuHotM();
    }
}
