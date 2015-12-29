package com.pregveda.devfest.pregveda;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class lifestyleActivity extends AppCompatActivity {



    ImageButton rest;
    ImageButton relaxation;
    ImageButton btnMeditation;
    ImageButton btnBadHabit;
    ImageButton btnSan;
    ImageButton imglifeStyleHome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lifestyle);

        imglifeStyleHome=(ImageButton)findViewById(R.id.imglifeStyleHome);

        rest = (ImageButton) findViewById(R.id.rest);

        relaxation=(ImageButton) findViewById(R.id.relaxation);

        btnMeditation = (ImageButton) findViewById(R.id.meditation);
        btnBadHabit = (ImageButton) findViewById(R.id.bad);

        btnSan = (ImageButton) findViewById(R.id.btnSan);

        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.rest);
            }
        });


        btnSan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.sanitation);
            }
        });

        relaxation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //txtAbd.setText("This is a test text for Abdominal Breathing");
                setContentView(R.layout.relaxation);
            }
        });

        btnMeditation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //txtAbd.setText("This is a test text for Abdominal Breathing");
                setContentView(R.layout.meditation);
            }
        });


        btnBadHabit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //txtAbd.setText("This is a test text for Abdominal Breathing");
                setContentView(R.layout.badhabits);
            }
        });

        imglifeStyleHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();

            }
        });

    }
    }


