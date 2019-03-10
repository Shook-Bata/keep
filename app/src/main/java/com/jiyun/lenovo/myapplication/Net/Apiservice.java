package com.jiyun.lenovo.myapplication.Net;

import com.jiyun.lenovo.myapplication.Bean.Dailynewsbean;
import com.jiyun.lenovo.myapplication.Bean.Dailynewsitembean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Lenovo on 2019/3/10.
 */

public interface Apiservice {

    String baseurl = "http://news-at.zhihu.com/api/4/";
    @GET("news/latest")
    Observable<Dailynewsbean> getdata();


    //知乎日报详情webview界面
    @GET("news/{news_id}")
    Observable<Dailynewsitembean> getdatas(@Path("news_id") int page);

}
