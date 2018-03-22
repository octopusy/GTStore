package com.gt.store.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.gt.store.ui.viewholder.OrderAllDataViewHolder;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

import com.gt.store.model.bean.OrderDataModel;

/**
 * author：Richard
 * Date：16/6/9 下午6:36
 */
public class OrderAllAdapter extends RecyclerArrayAdapter<OrderDataModel> {
    public OrderAllAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new OrderAllDataViewHolder(parent);
    }

    public class TipSpanSizeLookUp extends RecyclerArrayAdapter.GridSpanSizeLookup {

        public TipSpanSizeLookUp() {
            //列数默认为2
            super(2);
        }

        @Override
        public int getSpanSize(int position) {
            return 2;
        }
    }

    public TipSpanSizeLookUp obtainTipSpanSizeLookUp() {
        return new TipSpanSizeLookUp();
    }


}
