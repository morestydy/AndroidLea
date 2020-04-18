package com.example.uiwidgettest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mBtnTextview;
    private Button mBtnEditText;
    private Button mBtnImagineView;
    private Button mBtnProgressBar;
    private Button mBtnAlertDialog;
    private Button mBtnProgressDialog;
    private Button mBtnbtnExpressUi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextview=findViewById(R.id.btn_textview);
        mBtnEditText=findViewById(R.id.btn_edittext);
        mBtnImagineView=findViewById(R.id.btn_imagineview);
        mBtnProgressBar=findViewById(R.id.btn_progressbar);
        mBtnAlertDialog=findViewById(R.id.btn_alertdialog);
        mBtnProgressDialog=findViewById(R.id.btn_progressdialog);
        mBtnbtnExpressUi=findViewById(R.id.btn_expressui);
        setListeners();
    }

    private void setListeners() {
        Onclick onclick = new Onclick();
        mBtnTextview.setOnClickListener(onclick);
        mBtnEditText.setOnClickListener(onclick);
        mBtnImagineView.setOnClickListener(onclick);
        mBtnProgressBar.setOnClickListener(onclick);
        mBtnAlertDialog.setOnClickListener(onclick);
        mBtnProgressDialog.setOnClickListener(onclick);
        mBtnbtnExpressUi.setOnClickListener(onclick);
    }

    private class Onclick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_textview:
                    intent = new Intent(MainActivity.this,TextViewActivity.class);
                    break;
                case R.id.btn_edittext:
                    intent = new Intent(MainActivity.this,EditTextActivity.class);
                    break;
                case R.id.btn_imagineview:
                    intent = new Intent(MainActivity.this,ImagineViewActivity.class);
                    break;
                case R.id.btn_progressbar:
                    intent = new Intent(MainActivity.this,ProgressBarActivity.class);
                    break;
                case R.id.btn_alertdialog:
                    intent = new Intent(MainActivity.this,AlertDialogActivity.class);
                    break;
                case R.id.btn_progressdialog:
                    intent = new Intent(MainActivity.this,ProgressDialogActivity.class);
                    break;
                case R.id.btn_expressui:
                    intent = new Intent(MainActivity.this,ExpressUiActivity.class);
                    break;
                default:

            }
            startActivity(intent);
        }
    }
}
