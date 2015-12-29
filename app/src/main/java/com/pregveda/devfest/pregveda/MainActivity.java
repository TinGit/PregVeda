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
        setContentView(R.layout.activity_main2);

        imglifestyle=(ImageButton)findViewById(R.id.imglifestyle);
        imgmusic=(ImageButton)findViewById(R.id.imgmusic);
        imgnutrition=(ImageButton)findViewById(R.id.imgnutrition);
        imgSettings=(ImageButton)findViewById(R.id.imgSettings);


        imgexercise=(ImageButton)findViewById(R.id.imgexercise);
        imgsymptom=(ImageButton)findViewById(R.id.imgsymptom);

        imgeDelivery=(ImageButton)findViewById(R.id.imgeDelivery);



        imglifestyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,lifestyleActivity.class));// for calling the activity
            }
        });

        imgmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                startActivity(new Intent(MainActivity.this,musicAcitivity.class));
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


                startActivity(new Intent(MainActivity.this, ProfileActivity.class));

            }
        });






    }



}
