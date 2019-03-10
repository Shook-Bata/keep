package com.jiyun.lenovo.myapplication.Model;

import android.util.Log;

import com.jiyun.lenovo.myapplication.Base.BaseModel;
import com.jiyun.lenovo.myapplication.Bean.Dailynewsbean;
import com.jiyun.lenovo.myapplication.Net.Apiservice;
import com.jiyun.lenovo.myapplication.Net.Callback;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Lenovo on 2019/3/6.
 */

public class DailynewsM extends BaseModel {
    private String TAG = "DailynewsM";
    public void initdata(final Callback callback) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Apiservice.baseurl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Apiservice apiservice = retrofit.create(Apiservice.class);
        Observable<Dailynewsbean> getdata = apiservice.getdata();
        getdata.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Dailynewsbean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Dailynewsbean dailynewsbean) {
                        Log.d(TAG, "onNext: "+dailynewsbean.toString());
                        callback.Setdata(dailynewsbean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.Failed(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}
