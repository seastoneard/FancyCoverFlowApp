/*
 * Copyright 2013 David Schreiber
 *           2013 John Paul Nalog
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.zhh.fancycoverflowapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zhh.fancycoverflowapp.R;
import com.zhh.fancycoverflowapp.fancycoverflow.FancyCoverFlow;
import com.zhh.fancycoverflowapp.fancycoverflow.FancyCoverFlowAdapter;
import com.zhh.fancycoverflowapp.fancycoverflow.ScreenUtils;

import java.util.List;

/**
 * Created by zhh on 2017/11/18.
 */
public class FancyCoverFlowSampleAdapter extends FancyCoverFlowAdapter {

    private List<String> list = null;
    private LayoutInflater mInflater;

    public FancyCoverFlowSampleAdapter(Context context, List<String> list) {
        this.list = list;
        mInflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getCoverFlowItem(final int position, View reuseableView, ViewGroup viewGroup) {
        ViewHolder holder;
        if (reuseableView == null) {
            holder = new ViewHolder();
            reuseableView = mInflater.inflate(R.layout.gallery_item, null);
            //由屏幕大小适配边距(可调)--(一般不修改)
            reuseableView.setLayoutParams(new FancyCoverFlow.LayoutParams(ScreenUtils.dip2px(viewGroup.getContext(),
                    ScreenUtils.getScreenHeight(viewGroup.getContext()) > 1000 ? 280 : 265),
                    ScreenUtils.dip2px(viewGroup.getContext(), 170)));
            holder.text = (TextView) reuseableView.findViewById(R.id.text);
            reuseableView.setTag(holder);
        } else {
            holder = (ViewHolder) reuseableView.getTag();
        }
        holder.text.setText(list.get(position));
        return reuseableView;
    }

    final class ViewHolder {
        TextView text;
    }

}
