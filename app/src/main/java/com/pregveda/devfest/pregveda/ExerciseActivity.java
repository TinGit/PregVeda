package com.pregveda.devfest.pregveda;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by user on 12/27/15.
 */
public class ExerciseActivity extends Activity {

    ImageView imgExercise;
    ImageButton btnExcerPrev;
    ImageButton btnExcerHome;
    ImageButton  btnExcerNext;
    public static short imgID;
    @Override


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise);

        btnExcerPrev=(ImageButton)findViewById(R.id.btnExcerPrev);
        btnExcerHome=(ImageButton)findViewById(R.id.btnExcerHome);
        btnExcerNext=(ImageButton)findViewById(R.id.btnExcerNext);
        imgExercise=(ImageView)findViewById(R.id.imglifestyle);



        btnExcerHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }
        });



    }
}

