package com.example.intentexplicit20072021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // 1 : Lấy dữ liệu dạng chuỗi
        Intent intent = getIntent();
        if (intent != null){
            String chuoi = intent.getStringExtra("string");
            int number = intent.getIntExtra("integer",Integer.MIN_VALUE);

            Log.d("BBB","Chuỗi " + chuoi);
            Log.d("BBB","Số " + number);
        }

    }
}