package com.jiyun.lenovo.myapplication.View;

import com.jiyun.lenovo.myapplication.Base.BaseMvpView;
import com.jiyun.lenovo.myapplication.Bean.Dailynewsbean;

/**
 * Created by Lenovo on 2019/3/6.
 */

public interface DailynewsitemV extends BaseMvpView {


    void setdata(Dailynewsbean dailynewsbean);

    void failed(String message);
}
