package com.example.uiwidgettest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProgressDialogActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnPD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_dialog);
        mBtnPD=findViewById(R.id.btn_pb3);
        mBtnPD.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_pb3:
                ProgressDialog progressDialog = new ProgressDialog(ProgressDialogActivity.this);
                progressDialog.setTitle("This is dialog");
                progressDialog.setMessage("Loading...");
                progressDialog.setCancelable(true);//点击后会消失
                progressDialog.show();
                break;
        }
    }
}
