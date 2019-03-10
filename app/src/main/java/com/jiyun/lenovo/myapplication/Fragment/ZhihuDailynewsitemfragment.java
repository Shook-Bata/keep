package com.jiyun.lenovo.myapplication.Fragment;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.jiyun.lenovo.myapplication.Base.Basefragment;
import com.jiyun.lenovo.myapplication.Bean.Dailynewsitembean;
import com.jiyun.lenovo.myapplication.Net.Apiservice;
import com.jiyun.lenovo.myapplication.WebActivity;
import com.jiyun.lenovo.myapplication.adapter.RelDailynewsitemadapter;
import com.jiyun.lenovo.myapplication.Bean.Dailynewsbean;
import com.jiyun.lenovo.myapplication.R;
import com.jiyun.lenovo.myapplication.View.DailynewsitemV;
import com.jiyun.lenovo.myapplication.presenter.DailynewsitemP;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.Unbinder;
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

public class ZhihuDailynewsitemfragment extends Basefragment<DailynewsitemV, DailynewsitemP> implements DailynewsitemV {


    @BindView(R.id.xrel)
    XRecyclerView mXrel;
    private View view;
    private Unbinder unbinder;
    private RelDailynewsitemadapter mAdapter;
    private int mPosition;
    private String mShare_url;
    private String TAG = "ZhihuDailynewsitemfragment";

    @Override
    protected DailynewsitemP initpresenter() {
        return new DailynewsitemP();
    }
    @Override
    protected int initlayputid() {
        return R.layout.item_dailynewsitem;
    }

    @Override
    protected void initview() {
        super.initview();
        mXrel.setLayoutManager(new LinearLayoutManager(getContext()));
        ArrayList<Dailynewsbean.StoriesBean> storiesBeans = new ArrayList<>();
        ArrayList<Dailynewsbean.TopStoriesBean> topStoriesBeans = new ArrayList<>();

        mAdapter = new RelDailynewsitemadapter(getContext(),storiesBeans,topStoriesBeans);
        mXrel.setAdapter(mAdapter);
        mXrel.setLoadingMoreEnabled(false);
        mXrel.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                initdata();
            }

            @Override
            public void onLoadMore() {
            }
        });
        mAdapter.setonlicklistener(new RelDailynewsitemadapter.setonlick() {
            @Override
            public void setonlistener(View view, int position) {
                int id = mAdapter.mStoriesBeans.get(position).getId();
                Intent intent = new Intent(getContext(), WebActivity.class);
                intent.putExtra("path",id);
                startActivity(intent);

            }
        });
    }



    @Override
    protected void initdata() {
        super.initdata();
        mpresenter.initdata();
    }
    @Override
    public void setdata(final Dailynewsbean bean) {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mAdapter.adddata(bean);
            }
        });

    }

    @Override
    public void failed(String message) {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getContext(),"请求失败",Toast.LENGTH_LONG).show();
            }
        });
    }

}
