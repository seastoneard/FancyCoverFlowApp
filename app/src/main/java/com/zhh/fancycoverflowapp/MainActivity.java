package com.zhh.fancycoverflowapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.zhh.fancycoverflowapp.adapter.FancyCoverFlowSampleAdapter;
import com.zhh.fancycoverflowapp.fancycoverflow.FancyCoverFlow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhh on 2017/11/18.
 */
public class MainActivity extends AppCompatActivity {

    //适配器
    private FancyCoverFlowSampleAdapter adapter = null;

    private FancyCoverFlow fancyCoverFlow;

    private List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initLayout();
        initData();
    }

    private void initLayout() {
        fancyCoverFlow = (FancyCoverFlow) findViewById(R.id.main_gallery);
        fancyCoverFlow.dp2px();// child间距
        adapter = new FancyCoverFlowSampleAdapter(this, list);
        fancyCoverFlow.setAdapter(adapter);
        //点击事件监听
        fancyCoverFlow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "ItemClick-------->" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initData() {
        for (int i = 0; i < 9; i++) {
            list.add("" + i);
        }
        adapter.notifyDataSetChanged();
        fancyCoverFlow.setSelection(1);//显示第几个
    }

    /**
     * FancyCoverFlow属性使用
     *
     * // 未选中的透明度
     * this.fancyCoverFlow.setUnselectedAlpha(0.0f);
     * // 未选中的饱和度
     * this.fancyCoverFlow.setUnselectedSaturation(0.0f);
     * // 未选中的比例
     * this.fancyCoverFlow.setUnselectedScale(0.8f);
     * // child间距
     * this.fancyCoverFlow.setSpacing(-60);
     * // 旋转度数
     * this.fancyCoverFlow.setMaxRotation(0);
     * // 非选中的重心偏移,负的向上
     * this.fancyCoverFlow.setScaleDownGravity(-1f);
     * // 作用距离
     * this.fancyCoverFlow.setActionDistance(FancyCoverFlow.ACTION_DISTANCE_AUTO);
     */

}
