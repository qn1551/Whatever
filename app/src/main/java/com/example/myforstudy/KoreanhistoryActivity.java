package com.example.myforstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class KoreanhistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koreanhistory);
    }

    public void onPPakClicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cafe.naver.com/dongnote"));
        startActivity(intent);

    }
}