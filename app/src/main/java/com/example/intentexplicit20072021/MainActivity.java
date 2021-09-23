package com.example.intentexplicit20072021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.intentexplicit20072021.databinding.ActivityMainBinding;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.buttonIntentString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("string","Hello Main 2");
                intent.putExtra("integer",10);
                startActivity(intent);
            }
        });

        mBinding.buttonIntentObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<User> userArrayList = new ArrayList<>();
                userArrayList.add(new User("Nguyễn Văn A",20));
                userArrayList.add(new User("Nguyễn Văn B",30));
                userArrayList.add(new User("Nguyễn Văn C",40));
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("user", userArrayList);
                startActivity(intent);
            }
        });

    }
}