package com.jiyun.lenovo.myapplication.Bean;

import java.util.List;

/**
 * Created by Lenovo on 2019/3/10.
 */

public class Dailynewsbean {

    /**
     * date : 20190310
     * stories : [{"images":["https://pic4.zhimg.com/v2-fa5caf43016ab7cd58577acfb1948197.jpg"],"type":0,"id":9708684,"ga_prefix":"031008","title":"为了微信的一个 bug，蔡徐坤的粉丝们差点跟腾讯势不两立"},{"images":["https://pic1.zhimg.com/v2-dd3e290f9738207581015884ed35dc50.jpg"],"type":0,"id":9708446,"ga_prefix":"031007","title":"芦苇：不属于时代的人"},{"images":["https://pic1.zhimg.com/v2-982350243af9392bb5022c121e2ef048.jpg"],"type":0,"id":9708696,"ga_prefix":"031006","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"https://pic1.zhimg.com/v2-e8f8cd35f19f714e3dcc3e45c7023fa8.jpg","type":0,"id":9708684,"ga_prefix":"031008","title":"为了微信的一个 bug，蔡徐坤的粉丝们差点跟腾讯势不两立"},{"image":"https://pic2.zhimg.com/v2-53f622cd066036eaffa39c5d9be534b9.jpg","type":0,"id":9708663,"ga_prefix":"030818","title":"这盘开胃菜，记得看《惊奇队长》之前享用（无剧透）"},{"image":"https://pic3.zhimg.com/v2-2e3aaa3b1b34273062e5a06822a984ce.jpg","type":0,"id":9708658,"ga_prefix":"030907","title":"在科学家的眼里，黄金放在地下金库里那绝对是浪费"},{"image":"https://pic4.zhimg.com/v2-92ae00bf0f4b7fcbd3217ca302a27f2f.jpg","type":0,"id":9708474,"ga_prefix":"030809","title":"游戏直播间「双击送游艇」的老铁们，会一直氪下去吗？"},{"image":"https://pic2.zhimg.com/v2-be02f31edcccc5e0f8713f58fd9c0289.jpg","type":0,"id":9708571,"ga_prefix":"030618","title":"经营宁泽涛"}]
     */

    private String date;
    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        /**
         * images : ["https://pic4.zhimg.com/v2-fa5caf43016ab7cd58577acfb1948197.jpg"]
         * type : 0
         * id : 9708684
         * ga_prefix : 031008
         * title : 为了微信的一个 bug，蔡徐坤的粉丝们差点跟腾讯势不两立
         */

        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private List<String> images;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        /**
         * image : https://pic1.zhimg.com/v2-e8f8cd35f19f714e3dcc3e45c7023fa8.jpg
         * type : 0
         * id : 9708684
         * ga_prefix : 031008
         * title : 为了微信的一个 bug，蔡徐坤的粉丝们差点跟腾讯势不两立
         */

        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return "TopStoriesBean{" +
                    "image='" + image + '\'' +
                    ", type=" + type +
                    ", id=" + id +
                    ", ga_prefix='" + ga_prefix + '\'' +
                    ", title='" + title + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Dailynewsbean{" +
                "date='" + date + '\'' +
                ", stories=" + stories +
                ", top_stories=" + top_stories +
                '}';
    }
}
