package com.example.uiwidgettest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class ProgressBarActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtnPb;
    private ImageView mIVPb;
    private ProgressBar mPB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        mBtnPb = findViewById(R.id.btn_pb);
        mIVPb=findViewById(R.id.iv_pb);
        mPB=findViewById(R.id.pb_1);
        mBtnPb.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_pb:
//                切换显示状态
//                if(mPB.getVisibility()==View.GONE){
//                    mPB.setVisibility(View.VISIBLE);
//                }else {
//                    mPB.setVisibility(View.GONE);
//                }
//                进度条
                int progress = mPB.getProgress();
                progress = progress+10;
                mPB.setProgress(progress);
                break;
            default:
                break;
        }
    }
}
