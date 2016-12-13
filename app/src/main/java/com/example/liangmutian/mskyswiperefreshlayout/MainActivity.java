package com.example.liangmutian.mskyswiperefreshlayout;

import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mTextView;
    SwipeRefreshLayout swipeRefreshLayout;
    SwipeRefreshLayout.OnRefreshListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.textView1);

        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);

        listener = new SwipeRefreshLayout.OnRefreshListener() {

            @Override
            public void onRefresh() {

                mTextView.setText("正在刷新");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // TODO Auto-generated method stub
                        mTextView.setText("刷新完成");
                        swipeRefreshLayout.setRefreshing(false);
                    }
                }, 3000);
            }
        };


        swipeRefreshLayout.setColorSchemeResources(android.R.color.holo_blue_light, android.R.color.holo_red_light, android.R.color.holo_orange_light, android.R.color.holo_green_light);
        swipeRefreshLayout.setOnRefreshListener(listener);


       c

    }

    private void doReF() {

        swipeRefreshLayout.setRefreshing(true);
        listener.onRefresh();
    }

    public void re(View v) {


        doReF();

    }


}
