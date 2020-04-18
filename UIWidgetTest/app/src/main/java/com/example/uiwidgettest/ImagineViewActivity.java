package com.example.uiwidgettest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class ImagineViewActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView mIV;
    private Button mBtnIv;
    private ProgressBar mPB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagine_view);
        mIV=findViewById(R.id.iv_1);
        mBtnIv=findViewById(R.id.btn_iv);
        mBtnIv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_iv:
                mIV.setImageResource(R.drawable.img_2);
                break;
        }
    }
}
