package com.jiyun.lenovo.myapplication.presenter;

import com.jiyun.lenovo.myapplication.Base.BasePresenter;
import com.jiyun.lenovo.myapplication.Model.DailynewsM;
import com.jiyun.lenovo.myapplication.Model.DailynewsitemM;

/**
 * Created by Lenovo on 2019/3/6.
 */

public class DailynewsP extends BasePresenter {

    private DailynewsitemM mDailynewsM;

    @Override
    protected void initModel() {
        mDailynewsM = new DailynewsitemM();
    }
}
