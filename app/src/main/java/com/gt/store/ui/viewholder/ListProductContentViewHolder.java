package com.gt.store.ui.viewholder;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.gt.store.ui.activity.DetailContentActivity;
import com.gt.store.ui.fragment.DetailContentFragment;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;

import com.gt.store.R;
import com.gt.store.model.bean.ListProductContentModel;

/**
 * author：Richard
 * Date：16/5/26 上午10:52
 */
public class ListProductContentViewHolder extends BaseViewHolder<ListProductContentModel> implements View.OnClickListener {

    private SimpleDraweeView simpleDraweeView;
    private CardView cardView;
    private TextView title;
    private TextView price;
    private ListProductContentModel data;

    public ListProductContentViewHolder(ViewGroup parent) {
        super(parent, R.layout.itemview_listproduct_content);
        simpleDraweeView = $(R.id.list_product_img);
        title = $(R.id.list_product_title);
        price = $(R.id.list_product_price);
        cardView = $(R.id.list_product_cardview);
    }

    @Override
    public void setData(ListProductContentModel data) {
        super.setData(data);
        this.data = data;
        simpleDraweeView.setImageURI(Uri.parse(data.getImageUrl()));
        title.setText(data.getTitle());
        price.setText("￥ " + data.getPrice());
        cardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.list_product_cardview:
                intent.putExtra(DetailContentFragment.ARG_ITEM_INFO_LISTPRODUCT, data);
                break;
        }
        intent.setClass(getContext(), DetailContentActivity.class);
        getContext().startActivity(intent);

    }
}
