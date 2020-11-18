package com.example.myforstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MathActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
    }

    public void onPascalClicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pascal.education/main/"));
        startActivity(intent);

    }
}