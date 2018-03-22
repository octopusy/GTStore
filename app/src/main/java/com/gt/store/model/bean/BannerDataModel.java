package com.gt.store.model.bean;

import java.io.Serializable;

/**
 * author：Richard
 * Date：16/5/25 下午10:41
 */
public class BannerDataModel  implements Serializable {

    private String name;
    private String introduce;
    private String imageUrl;


    public BannerDataModel(String introduce, String name, String imageUrl) {
        this.introduce = introduce;
        this.name = name;
        this.imageUrl = imageUrl;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }



}
