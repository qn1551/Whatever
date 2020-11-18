package com.example.myforstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    public static  final int REQUEST_CODE_MENU = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button button = findViewById(R.id.Korean);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KoreanActivity.class);
                startActivityForResult(intent, REQUEST_CODE_MENU);
            }
        });

        Button button1 = findViewById(R.id.Mathpile);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MathActivity.class);
                startActivityForResult(intent, REQUEST_CODE_MENU);
            }
        });

        Button button2 = findViewById(R.id.English);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EnglishActivity.class);
                startActivityForResult(intent, REQUEST_CODE_MENU);
            }
        });

        Button button3 = findViewById(R.id.Koreanhistory);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KoreanhistoryActivity.class);
                startActivityForResult(intent, REQUEST_CODE_MENU);
            }
        });

        Button button4 = findViewById(R.id.All);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AllActivity.class);
                startActivityForResult(intent, REQUEST_CODE_MENU);
            }
        });
    }

}