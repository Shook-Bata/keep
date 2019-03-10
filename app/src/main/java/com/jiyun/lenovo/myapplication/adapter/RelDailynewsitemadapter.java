package com.jiyun.lenovo.myapplication.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jiyun.lenovo.myapplication.Bean.Dailynewsbean;
import com.jiyun.lenovo.myapplication.R;
import com.youth.banner.Banner;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 2019/3/10.
 */

public class RelDailynewsitemadapter extends RecyclerView.Adapter {
    private final Context mContext;
    public ArrayList<Dailynewsbean.StoriesBean> mStoriesBeans = new ArrayList<>();
    public ArrayList<Dailynewsbean.TopStoriesBean> mTopStoriesBeans = new ArrayList<>();
    private static int VIEW_TYPE_TOP = 0;
    private static int VIEW_TYPE_TIME = 1;
    private static int VIEW_TYPE_NEWS = 2;
    private String mDate;
    private setonlick mManger;

    public RelDailynewsitemadapter(Context context, ArrayList<Dailynewsbean.StoriesBean> storiesBeans, ArrayList<Dailynewsbean.TopStoriesBean> topStoriesBeans) {
        mContext = context;
        mStoriesBeans = storiesBeans;
        mTopStoriesBeans = topStoriesBeans;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if (viewType == VIEW_TYPE_TOP) {
            View inflate = LayoutInflater.from(mContext).inflate(R.layout.baner, null, false);
            return new bannerholder(inflate);
        } else if (viewType == VIEW_TYPE_TIME) {
            View inflate = LayoutInflater.from(mContext).inflate(R.layout.time, null, false);
            return new textholder(inflate);
        } else {
            View inflate = LayoutInflater.from(mContext).inflate(R.layout.news, null, false);
            return new viewholder(inflate);
        }
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        int itemViewType = getItemViewType(position);
        if(itemViewType ==  VIEW_TYPE_TOP){
            final bannerholder holder1 = (bannerholder) holder;
            holder1.mBaner.setImages(mTopStoriesBeans).setImageLoader(new ImageLoader() {
                @Override
                public void displayImage(Context context, Object path, ImageView imageView) {
                    Dailynewsbean.TopStoriesBean path1 = (Dailynewsbean.TopStoriesBean) path;
                    Glide.with(context).load(path1.getImage()).into(imageView);
                }
            }).start();
            holder1.mBaner.setOnBannerListener(new OnBannerListener() {
                @Override
                public void OnBannerClick(int position) {
                    int id = mTopStoriesBeans.get(position).getId();
                    mManger.setonlistener(holder1.itemView,position);
                }
            }).start();
        }else if(itemViewType==VIEW_TYPE_TIME){
            textholder holder1 = (textholder) holder;
            holder1.mTime.setText(mDate);
        }else{
            int newPosition = position-1;
            if (mTopStoriesBeans.size()>0){
                newPosition-=1;
            }

            viewholder holder1 = (viewholder) holder;
            Dailynewsbean.StoriesBean storiesBean = mStoriesBeans.get(newPosition);
            holder1.mTitle.setText(storiesBean.getTitle());
            Glide.with(mContext).load(storiesBean.getImages().get(0)).into(holder1.mImage);
            final int finalNewPosition = newPosition;
            holder1.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mManger!=null){
                        mManger.setonlistener(v, finalNewPosition);
                    }
                }
            });
        }
    }
    @Override
    public int getItemViewType(int position) {
        if (mTopStoriesBeans.size() > 0) {
            if (position == 0) {
                return VIEW_TYPE_TOP;
            } else if (position == 1) {
                return VIEW_TYPE_TIME;
            } else {
                return VIEW_TYPE_NEWS;
            }
        } else if (position == 0) {
            return VIEW_TYPE_TIME;
        } else {
            return VIEW_TYPE_NEWS;
        }

    }

    @Override
    public int getItemCount() {
        if (mTopStoriesBeans.size() > 0) {
            return mStoriesBeans.size() + 1 + 1;
        } else {
            return mStoriesBeans.size() + 1;
        }
    }

    public void adddata(Dailynewsbean bean) {
        mDate = bean.getDate();
        List<Dailynewsbean.StoriesBean> stories = bean.getStories();
        mStoriesBeans.clear();
        mStoriesBeans.addAll(stories);
        List<Dailynewsbean.TopStoriesBean> top = bean.getTop_stories();
        mTopStoriesBeans.clear();
        mTopStoriesBeans.addAll(top);
        notifyDataSetChanged();
    }

    class viewholder extends RecyclerView.ViewHolder {

        private final ImageView mImage;
        private final TextView mTitle;

        public viewholder(View itemView) {
            super(itemView);
            mImage = itemView.findViewById(R.id.img);
            mTitle = itemView.findViewById(R.id.tv_title);
        }
    }

    class bannerholder extends RecyclerView.ViewHolder {

        private final Banner mBaner;

        public bannerholder(View itemView) {
            super(itemView);
            mBaner = itemView.findViewById(R.id.baner);
        }
    }

    class textholder extends RecyclerView.ViewHolder {
        private final TextView mTime;

        public textholder(View itemView) {
            super(itemView);
            mTime = itemView.findViewById(R.id.tv_biao);
        }
    }
    public interface setonlick{
        void setonlistener(View view,int position);
    }
    public void setonlicklistener(setonlick manger){
        mManger = manger;
    }
}
