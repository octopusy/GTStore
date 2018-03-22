package com.gt.store.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.gt.store.model.bean.SubCommentDataModel;
import com.gt.store.ui.viewholder.NoSubCommentViewHolder;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

import com.gt.store.ui.viewholder.SubCommentViewHolder;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * author：Richard
 * Date：16/6/17 下午10:11
 */
public class SubCommentAdapter extends RecyclerArrayAdapter<SubCommentDataModel> {

    private int subCommentDetail = 0;
    private int noCommentData = 1;

    public static HashMap<Integer, ArrayList<HashMap<Integer, Boolean>>> isNotLike = new HashMap<>();

    public SubCommentAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {

        if (viewType == subCommentDetail) {
            return new SubCommentViewHolder(parent);
        } else if (viewType == noCommentData) {
            return new NoSubCommentViewHolder(parent);

        }
        return null;
    }

    @Override
    public int getViewType(int position) {

        if (getItem(0) != null) {
            return subCommentDetail;
        } else {
            return noCommentData;
        }
    }

}