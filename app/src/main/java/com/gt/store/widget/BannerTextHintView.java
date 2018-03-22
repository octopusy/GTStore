package com.gt.store.widget;

import android.content.Context;

import com.gt.store.model.bean.BannerDataModel;
import com.jude.rollviewpager.hintview.TextHintView;

import java.util.List;

/**
 * author：Richard
 * Date：16/5/25 下午11:21
 */
public class BannerTextHintView extends TextHintView {
    List<BannerDataModel> bannerDataModels;

    public BannerTextHintView(Context context, List<BannerDataModel> bannerDataModels) {
        super(context);
        this.bannerDataModels = bannerDataModels;
    }

    @Override
    public void setCurrent(int current) {
        setText(" " + (current + 1) + "/" + bannerDataModels.size() + "  " + bannerDataModels.get(current).getIntroduce());
    }
}
