package com.pregveda.devfest.pregveda;

import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class exerciseActivity extends AppCompatActivity {

    ImageView ImgViewExer;
    ImageButton btnExcerNext;
    ImageButton btnExcerHome;
    ImageButton btnExcerPrev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        btnExcerNext=(ImageButton)findViewById(R.id.btnExcerNext);
        btnExcerHome=(ImageButton)findViewById(R.id.btnExcerHome);
        btnExcerPrev=(ImageButton)findViewById(R.id.btnExcerPrev);
        ImgViewExer=(ImageView)findViewById(R.id.ImgViewExer);
    btnExcerHome.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    });
        btnExcerNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImgViewExer.setImageURI(Uri.parse("exercise2"));
            }
        });
        btnExcerPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
