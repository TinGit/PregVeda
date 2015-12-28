package com.pregveda.devfest.pregveda;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class nutritionActivity extends AppCompatActivity {

    ImageButton imgbtnHome;
    TextView textViewnu4;
    ImageButton imgbtnNext;
    ImageView ml;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);
       imgbtnNext=(ImageButton)findViewById(R.id.imgbtnNext);
        textViewnu4=(TextView)findViewById(R.id.textViewnu4);
        imgbtnHome=(ImageButton)findViewById(R.id.imgbtnHome);
        imgbtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewnu4.setText("I change this text now so here it is ");

            }
        });
        imgbtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

}
