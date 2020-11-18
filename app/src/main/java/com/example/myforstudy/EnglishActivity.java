package com.example.myforstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class EnglishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
    }

    public void onHwangClicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cafe.naver.com/maljjang2"));
        startActivity(intent);

    }

    public void onHongClicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cafe.naver.com/hongsoonbum"));
        startActivity(intent);

    }

    public void onRightClicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cafe.naver.com/politicstory"));
        startActivity(intent);

    }

    public void onExamClicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.exam4you.com/"));
        startActivity(intent);

    }
}