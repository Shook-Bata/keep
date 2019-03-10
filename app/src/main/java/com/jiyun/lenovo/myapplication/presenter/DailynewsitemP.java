package com.jiyun.lenovo.myapplication.presenter;

import com.jiyun.lenovo.myapplication.Base.BasePresenter;
import com.jiyun.lenovo.myapplication.Bean.Dailynewsbean;
import com.jiyun.lenovo.myapplication.Model.DailynewsM;
import com.jiyun.lenovo.myapplication.Net.Callback;
import com.jiyun.lenovo.myapplication.View.DailynewsitemV;

/**
 * Created by Lenovo on 2019/3/6.
 */

public class DailynewsitemP extends BasePresenter<DailynewsitemV> {


    private DailynewsM mDailynewsM;

    @Override
    protected void initModel() {
        mDailynewsM = new DailynewsM();
    }

    public void initdata() {
        mDailynewsM.initdata(new Callback() {
            @Override
            public void Failed(String message) {
              mview.failed(message);
            }

            @Override
            public void Setdata(Dailynewsbean dailynewsbean) {
                mview.setdata(dailynewsbean);
            }
        });

    }
}
