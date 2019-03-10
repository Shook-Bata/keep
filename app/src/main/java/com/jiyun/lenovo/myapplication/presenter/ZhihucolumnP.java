package com.jiyun.lenovo.myapplication.presenter;

import com.jiyun.lenovo.myapplication.Base.BasePresenter;
import com.jiyun.lenovo.myapplication.Model.ZhihucolumnM;

/**
 * Created by Lenovo on 2019/3/6.
 */

public class ZhihucolumnP extends BasePresenter {


    private ZhihucolumnM mZhihucolumnM;

    @Override
    protected void initModel() {
        mZhihucolumnM = new ZhihucolumnM();
    }
}
