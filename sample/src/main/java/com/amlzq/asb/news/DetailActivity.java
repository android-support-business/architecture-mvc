package com.amlzq.asb.news;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.amlzq.android.log.Log;
import com.amlzq.asb.R;

/**
 * 详情页
 *
 * <p>newIntent创建意图的具体示例来自</p>
 * <ul>
 * <li>借鉴Fragment.newInstance(...)思想</li>
 * <li> 具体示例来自tv.danmaku.ijk.media.example.activities.VideoActivity </li>
 * </ul>
 */

public class DetailActivity extends AppCompatActivity {

    private String mId;

    public static Intent newIntent(Context context, String id) {
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra("id", id);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mId = getIntent().getStringExtra("id");
        setContentView(R.layout.activity_detail);
        Log.d(mId);
    }

}
