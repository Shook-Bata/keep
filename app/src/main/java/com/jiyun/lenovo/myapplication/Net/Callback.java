package com.jiyun.lenovo.myapplication.Net;

import com.jiyun.lenovo.myapplication.Bean.Dailynewsbean;

/**
 * Created by Lenovo on 2019/3/10.
 */

public interface Callback {


    void Failed(String message);

    void Setdata(Dailynewsbean dailynewsbean);

}
