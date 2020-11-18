package com.example.myforstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class PPTActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_p_t);
    }

    public void onMiriClicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.miricanvas.com/"));
        startActivity(intent);

    }

    public void onKindClicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://leehyekang.blogspot.com/"));
        startActivity(intent);

    }
    public void onSaeClicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://post.naver.com/my.nhn?memberNo=6532296"));
        startActivity(intent);

    }
    public void onJalClicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blog.naver.com/wkfdl1"));
        startActivity(intent);

    }
    public void onHaelingClicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blog.naver.com/jee6959"));
        startActivity(intent);

    }
    public void onflactionClicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.flaticon.com/"));
        startActivity(intent);

    }


}