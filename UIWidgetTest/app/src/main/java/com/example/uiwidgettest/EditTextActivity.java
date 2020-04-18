package com.example.uiwidgettest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editText;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        button = findViewById(R.id.btn_ed);
        editText=findViewById(R.id.et_1);
        button.setOnClickListener(this);
    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_ed:
                String inputString = editText.getText().toString();
                Toast.makeText(EditTextActivity.this,inputString,Toast.LENGTH_SHORT).show();
                break;
        }
    }


}
