package com.pregveda.devfest.pregveda;

import android.os.Bundle;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

ImageButton imgnutrition;
    ImageButton imgmusic;
    ImageButton imgexercise;
    ImageButton imgsymptom;
    ImageButton imglifestyle;
    ImageButton imgeDelivery;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgnutrition=(ImageButton)findViewById(R.id.imgnutrition);
         imgexercise=(ImageButton)(ImageButton)findViewById(R.id.imgexercise);
          imgsymptom=(ImageButton)(ImageButton)findViewById(R.id.imgsymptom);
          imglifestyle=(ImageButton)(ImageButton)findViewById(R.id.imglifestyle);
          imgeDelivery=(ImageButton)(ImageButton)findViewById(R.id.imgeDelivery);
        imgmusic=(ImageButton)(ImageButton)findViewById(R.id.imgmusic);

        imgnutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.nutrition);
            }
        });

        imgexercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.exercise);
            }
        });

        imgsymptom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.symptoms);
            }
        });

        imglifestyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.lifestyle);
            }
        });

        imgmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.music);
            }
        });






    }



}
