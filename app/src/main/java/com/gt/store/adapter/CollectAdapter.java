package com.gt.store.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

import com.gt.store.model.bean.ListProductContentModel;
import com.gt.store.ui.viewholder.CollectDataViewHolder;

/**
 * author：Richard
 * Date：16/6/10 下午11:18
 */
public class CollectAdapter extends RecyclerArrayAdapter<ListProductContentModel> {

    public CollectAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new CollectDataViewHolder(parent);
    }

    public class TipSpanSizeLookUp extends GridSpanSizeLookup {

        public TipSpanSizeLookUp() {
            //列数默认为2
            super(2);
        }

        @Override
        public int getSpanSize(int position) {
            return 1;
        }
    }

    public TipSpanSizeLookUp obtainTipSpanSizeLookUp() {
        return new TipSpanSizeLookUp();
    }



}
