package com.jiyun.lenovo.myapplication.Base;

/**
 * Created by Lenovo on 2019/3/9.
 */

public abstract class BasePresenter<V extends  BaseMvpView>{


    public  V mview;

    public BasePresenter() {
        initModel();
    }

    protected abstract void initModel();


    public  void attches(V view) {
        mview = view;
    }



}
