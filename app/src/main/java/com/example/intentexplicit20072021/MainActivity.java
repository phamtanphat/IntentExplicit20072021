package com.example.intentexplicit20072021;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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
                startActivityForResult(intent,123);
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

        mBinding.buttonIntentParcelable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Client> clients = new ArrayList<>();
                clients.add(new Client("1","Tèo"));
                clients.add(new Client("2","Ty"));

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putParcelableArrayListExtra("clients",clients);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 123 && resultCode == RESULT_OK && data != null){
            Bundle bundle = data.getBundleExtra("bundle");
            if (bundle != null){
                String message = bundle.getString("string");
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}