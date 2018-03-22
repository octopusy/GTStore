package com.gt.store.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.gt.store.model.bean.ListProductContentModel;
import com.gt.store.ui.viewholder.CategorizeDetailProductViewHolder;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

/**
 * author：Richard
 * Date：16/6/4 下午7:14
 */
public class CategorizeDetailProductAdapter extends RecyclerArrayAdapter<ListProductContentModel> {

    public CategorizeDetailProductAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new CategorizeDetailProductViewHolder(parent);
    }


    public class TipSpanSizeLookUp extends GridSpanSizeLookup {

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
