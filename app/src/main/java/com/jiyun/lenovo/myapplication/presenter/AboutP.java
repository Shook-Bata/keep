package com.jiyun.lenovo.myapplication.presenter;

import com.jiyun.lenovo.myapplication.Base.BasePresenter;
import com.jiyun.lenovo.myapplication.Model.AboutM;

/**
 * Created by Lenovo on 2019/3/6.
 */

public class AboutP extends BasePresenter {

    private AboutM mAboutM;

    @Override
    protected void initModel() {
        mAboutM = new AboutM();
    }
}
