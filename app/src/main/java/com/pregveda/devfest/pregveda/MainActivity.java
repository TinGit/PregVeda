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


        imglifestyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),lifestyleActivity.class);
                startActivity(intent);// for calling the activity
            }
        });








    }



}
