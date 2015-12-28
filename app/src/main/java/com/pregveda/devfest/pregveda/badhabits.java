package com.pregveda.devfest.pregveda;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by TinbitKassahun on 12/28/2015.
 */
public class badhabits extends Activity {

    ImageButton imgBtn;
    ImageButton imgBtn2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.badhabits);


        imgBtn = (ImageButton) findViewById(R.id.badHabit_home);
        imgBtn2= (ImageButton) findViewById(R.id.badHabit_next);

        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }
        });

        imgBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.badhabits_next);
            }
        });

    }
}
