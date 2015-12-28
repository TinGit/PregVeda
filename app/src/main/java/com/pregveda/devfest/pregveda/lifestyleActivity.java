package com.pregveda.devfest.pregveda;

import android.app.Activity;
import android.content.Intent;
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


    ImageButton imageButton;
    Button btnRest;
    Button btnAbd;
    Button btnRelax;

    Button btnMeditation;
    Button btnBadHabit;
    Button sanitationBtn;
    ImageButton imglifeStyleHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.lifestyle);

        imglifeStyleHome=(ImageButton)findViewById(R.id.imglifeStyleHome);

        btnRest = (Button) findViewById(R.id.rest);
        btnAbd = (Button) findViewById(R.id.abdominal);
        btnRelax=(Button) findViewById(R.id.relaxation);

        btnMeditation = (Button) findViewById(R.id.meditation);
        btnBadHabit = (Button) findViewById(R.id.bad);

        sanitationBtn = (Button) findViewById(R.id.btnSan);

        btnRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.rest);
            }
        });
        btnAbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //txtAbd.setText("This is a test text for Abdominal Breathing");
                setContentView(R.layout.abdominal_breathing);
            }
        });

        sanitationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.sanitation);
            }
        });

        btnRelax.setOnClickListener(new View.OnClickListener() {
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


