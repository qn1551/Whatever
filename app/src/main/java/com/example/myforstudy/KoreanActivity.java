package com.example.myforstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class KoreanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korean);
    }

    public void onKoreanConfodenceClicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.xn—439awzx48bzsc91c.com/kor/main/"));
        startActivity(intent);

    }
    public void onSunengKoreanClicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cafe.naver.com/koreanlaboratory"));
        startActivity(intent);

    }
}