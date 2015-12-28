package com.pregveda.devfest.pregveda;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageButton;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

ImageButton imgnutrition;
    ImageButton imgmusic;
    ImageButton imgexercise;
    ImageButton imgsymptom;
    ImageButton imglifestyle;
    ImageButton imgeDelivery;
    ImageButton  imgSettings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgnutrition=(ImageButton)findViewById(R.id.imgnutrition);
        imgexercise=(ImageButton)findViewById(R.id.imgexercise);
        imgsymptom=(ImageButton)findViewById(R.id.imgsymptom);
        imglifestyle=(ImageButton)findViewById(R.id.imglifestyle);
        imgeDelivery=(ImageButton)findViewById(R.id.imgeDelivery);
        imgmusic=(ImageButton)findViewById(R.id.imgmusic);
        imgSettings=(ImageButton)findViewById(R.id.imgSettings);

        imglifestyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent1 = new Intent(getApplicationContext(),lifestyleActivity.class);
                startActivity(new Intent(MainActivity.this,lifestyleActivity.class));// for calling the activity
            }
        });

        imgmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(),musicAcitivity.class);
                startActivity(intent2);// for calling the activity
            }
        });
        imgnutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,nutritionActivity.class));
            }
        });
        imgSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_profile);

            }
        });






    }



}
