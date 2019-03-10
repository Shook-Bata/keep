package com.jiyun.lenovo.myapplication.Base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by Lenovo on 2019/3/9.
 */

public abstract class BaseActivity<V extends BaseMvpView , T extends  BasePresenter> extends AppCompatActivity {
    protected  T mBasepresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initlayoutid());
        ButterKnife.bind(this);
        initdata();
        initview();
        initlistener();
        if(mBasepresenter!=null){
            mBasepresenter.attches((V) this);
        }
    }

    public  void initview() {

    }

    public  void initdata() {

    }
    public  void initlistener() {

    }


    protected abstract T initpresenter();

    protected abstract int initlayoutid();

}
