package com.example.uicustomviews;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    private ImageView mIvCuit,mIvBott;
    private Button mBtnCuit,mBtnAffair,mBtnVpn,mBtnInfo,mBtnTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }
        mIvCuit = findViewById(R.id.iv_cuit);
        Glide.with(this).load("https://www.cuit.edu.cn/Images/logo.png").into(mIvCuit);
        mIvBott = findViewById(R.id.iv_bott);
        Glide.with(this).load("https://www.cuit.edu.cn/Images/Slide/2020_04_06_20_11_53_1153.jpg").into(mIvBott);

        mBtnCuit = findViewById(R.id.btn_cuit);
        mBtnAffair = findViewById(R.id.btn_affair);
        mBtnVpn = findViewById(R.id.btn_vpn);
        mBtnInfo = findViewById(R.id.btn_info);
        mBtnTimer = findViewById(R.id.btn_timer);
        setListeners();
    }

    private void setListeners() {
        Onclick onclick = new Onclick();
        mBtnCuit.setOnClickListener(onclick);
        mBtnAffair.setOnClickListener(onclick);
        mBtnVpn.setOnClickListener(onclick);
        mBtnInfo.setOnClickListener(onclick);
        mBtnTimer.setOnClickListener(onclick);
    }
    public class Onclick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_cuit:
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.cuit.edu.cn/"));
                    break;
                case R.id.btn_affair:
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://jwc.cuit.edu.cn/"));
                    break;
                case R.id.btn_vpn:
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://webvpn.cuit.edu.cn/portal/#!/login"));
                    break;
                case R.id.btn_info:
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://jwgl-cuit-edu-cn.webvpn.cuit.edu.cn:8118/eams/home.action"));
                    break;
                case R.id.btn_timer:
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://jxgl.cuit.edu.cn/jkdk"));
                    break;
                default:
                    break;
            }
            startActivity(intent);
        }
    }
}
