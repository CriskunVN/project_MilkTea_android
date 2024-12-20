package com.example.mgmilktea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btn_ban1,btn_ban2,btn_ban3,btn_ban4,btn_ban5,btn_ban6
            , btn_addfood,btn_camera,btn_income;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_ban1 = findViewById(R.id.btn_ban1);
        btn_ban2 = findViewById(R.id.btn_ban2);
        btn_ban3 = findViewById(R.id.btn_ban3);
        btn_ban4 = findViewById(R.id.btn_ban4);
        btn_ban5 = findViewById(R.id.btn_ban5);
        btn_ban6 = findViewById(R.id.btn_ban6);
        btn_addfood = findViewById(R.id.btn_addfood);
        btn_camera = findViewById(R.id.btn_camera);
        btn_income= findViewById(R.id.btn_income);


        btn_ban1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this,Ban1Activity.class);
                startActivity(intent);
            }
        });

        btn_ban2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this,Ban2Activity.class);
                startActivity(intent);
            }
        });

        btn_ban3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this,Ban3Activity.class);
                startActivity(intent);
            }
        });

        btn_ban4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this,Ban4Activity.class);
                startActivity(intent);
            }
        });

        btn_ban5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this,Ban5Activity.class);
                startActivity(intent);
            }
        });

        btn_ban6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this,Ban6Activity.class);
                startActivity(intent);
            }
        });
        btn_addfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this,AddfoodActivity.class);
                startActivity(intent);
            }
        });

        btn_income.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this,IncomeActivity.class);
                startActivity(intent);
            }
        });

        btn_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this,CameraActivity.class);
                startActivity(intent);
            }
        });

    }

}