package com.gt.store.adapter;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.view.ViewGroup;

import com.gt.store.model.bean.ListProductContentModel;
import com.gt.store.ui.activity.MainActivity;
import com.gt.store.ui.viewholder.ListProductContentViewHolder;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

/**
 * author：Richard
 * Date：16/5/26 上午10:50
 */
public class ListProductAdapter extends RecyclerArrayAdapter<ListProductContentModel> {

    private FloatingActionButton fab;

    public ListProductAdapter(Context context) {
        super(context);
        this.fab = MainActivity.floatBtn;
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new ListProductContentViewHolder(parent);
    }

    @Override
    public int getViewType(int position) {
        if(position == getCount()-1){
            if(fab.isShown()){
                fab.hide();
            }
        }

        return super.getViewType(position);
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
