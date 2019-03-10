package com.jiyun.lenovo.myapplication.presenter;

import com.jiyun.lenovo.myapplication.Base.BasePresenter;
import com.jiyun.lenovo.myapplication.Model.LikeM;

/**
 * Created by Lenovo on 2019/3/6.
 */

public class LikeP extends BasePresenter {


    private LikeM mLikeM;

    @Override
    protected void initModel() {
        mLikeM = new LikeM();
    }
}
