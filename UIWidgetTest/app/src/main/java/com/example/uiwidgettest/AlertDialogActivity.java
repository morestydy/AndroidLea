package com.example.uiwidgettest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlertDialogActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtnAlertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);
        mBtnAlertDialog = findViewById(R.id.btn_pb2);
        mBtnAlertDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_pb2:
                AlertDialog.Builder dialog=new AlertDialog.Builder(AlertDialogActivity.this);
                dialog.setTitle("This is Dialog");
                dialog.setMessage("Something important:");
                dialog.setCancelable(false);                //设置dialog是否消失.对话框弹出后点击或按返回键不消失
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
//                    显示ok按钮
                    }
                });
                dialog.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
//                    显示cancel按钮
                    }
                });
                dialog.show();
                break;
            default:
                break;
        }
    }
}
