package com.pregveda.devfest.pregveda;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class nutritionActivity extends AppCompatActivity {

    TextView textView4;
    Button btnNext;
    ImageView ml;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);
        btnNext=(Button)findViewById(R.id.btnNext);
        textView4=(TextView)findViewById(R.id.textView4);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView4.setText("I change this text now so here it is ");

            }
        });


    }

}
