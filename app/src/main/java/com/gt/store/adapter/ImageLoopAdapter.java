package com.gt.store.adapter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.drawee.view.SimpleDraweeView;
import com.gt.store.ui.activity.SearchActivity;
import com.jude.rollviewpager.adapter.DynamicPagerAdapter;

import com.gt.store.R;
import com.gt.store.model.bean.BannerDataModel;

import java.util.List;

/**
 * author：Richard
 * Date：16/5/25 下午10:42
 */
public class ImageLoopAdapter extends DynamicPagerAdapter {

    private List<BannerDataModel> bannerDataModels;

    public ImageLoopAdapter(List<BannerDataModel> bannerDataModels){
        this.bannerDataModels = bannerDataModels;
    }
    public ImageLoopAdapter(){}

    @Override
    public View getView(final ViewGroup container, final int position) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.view_rollviewpager, null);
        SimpleDraweeView mSimpleDraweeView =(SimpleDraweeView)view.findViewById(R.id.viewPager_img);
        mSimpleDraweeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("search", bannerDataModels.get(position).getName());
                Intent intent = new Intent();
                intent.putExtra("search", bundle);
                intent.setClass(container.getContext(), SearchActivity.class);
                container.getContext().startActivity(intent);
            }
        });
        mSimpleDraweeView.setImageURI(Uri.parse(bannerDataModels.get(position).getImageUrl()));
        return view;
    }

    @Override
    public int getCount() {
        if (bannerDataModels != null) {
            return bannerDataModels.size();
        } else {
            return 0;
        }
    }

    public void setBannerDataModels(List<BannerDataModel> bannerDataModels) {
        this.bannerDataModels = bannerDataModels;
    }
}
