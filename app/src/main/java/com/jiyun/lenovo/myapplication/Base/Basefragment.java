package com.jiyun.lenovo.myapplication.Base;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Lenovo on 2019/3/6.
 */

public abstract class Basefragment<V extends  BaseMvpView,T extends BasePresenter>  extends  Fragment{

    private Unbinder mBind;
    protected  T mpresenter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(initlayputid(),null);
        mBind = ButterKnife.bind(this, view);
        mpresenter = initpresenter();
        if(mpresenter!=null ){
            mpresenter.attches((V)this);
        }
        initview();
        initlistener();
        initdata();
        return view;
    }

    protected void initdata() {

    }

    protected void initlistener() {

    }

    protected void initview() {

    }

    protected abstract T initpresenter();


    protected abstract int initlayputid();

    @Override
    public void onDestroy() {
        super.onDestroy();
        mBind.unbind();
    }
}
