package com.jiyun.lenovo.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.jiyun.lenovo.myapplication.Bean.Dailynewsitembean;
import com.jiyun.lenovo.myapplication.Net.Apiservice;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class WebActivity extends AppCompatActivity {

    private static final String TAG = "WebActivity";
    private WebView mWeb;
    private int mPath;
    private String mShare_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        mPath = getIntent().getIntExtra("path", 0);
        initdatas(mPath);
        initView();
    }

    private void initView() {
        mWeb = (WebView) findViewById(R.id.web);
        //WebSettings settings = mWeb.getSettings();
        //设置webview支持js代码
        //settings.setJavaScriptEnabled(true);
    }

    private String getHtmlData(String bodyHTML) {
        String head = "<head>" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\"> " +
                "<style>img{max-width: 100%; width:auto; height:auto;}</style>" +
                "</head>";
        return "<html>" + head + "<body>" + bodyHTML + "</body></html>";
    }
    private void initdatas(int position) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Apiservice.baseurl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        Apiservice apiservice = retrofit.create(Apiservice.class);
        Observable<Dailynewsitembean> getdatas = apiservice.getdatas(position);
        getdatas.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Dailynewsitembean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Dailynewsitembean dailynewsitembean) {

                        mShare_url = dailynewsitembean.getBody();
                        mWeb.loadData(getHtmlData(mShare_url),"text/html; charset=UTF-8", null);

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}
