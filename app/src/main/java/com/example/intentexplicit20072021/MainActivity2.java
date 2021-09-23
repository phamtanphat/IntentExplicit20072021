package com.example.intentexplicit20072021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.intentexplicit20072021.databinding.ActivityMain2Binding;
import com.example.intentexplicit20072021.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {

    ActivityMain2Binding main2Binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        main2Binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(main2Binding.getRoot());

        // 1 : Lấy dữ liệu dạng chuỗi
//        Intent intent = getIntent();
//        if (intent != null){
//            String chuoi = intent.getStringExtra("string");
//            int number = intent.getIntExtra("integer",Integer.MIN_VALUE);
//
//            Log.d("BBB","Chuỗi " + chuoi);
//            Log.d("BBB","Số " + number);
//        }

        // 2 : Lấy dữ liệu dạng object
        Intent intent = getIntent();
        if (intent != null){
            User user = (User) intent.getSerializableExtra("user");
            Log.d("BBB",user.toString());
        }

    }
}