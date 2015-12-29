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

    ImageButton imgbtnHome;
    ImageButton imgbtnNext;
    ImageButton imgbtnPrev;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.badhabits);


        imgbtnHome = (ImageButton) findViewById(R.id.imgbtnHome);
        imgbtnNext= (ImageButton) findViewById(R.id.imgbtnNext);
        imgbtnPrev= (ImageButton) findViewById(R.id.imgbtnPrev);
       /* imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }
        });*/

        imgbtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  setContentView(R.layout.badhabits_next);
                finish();
            }
        });

        imgbtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.badhabits_next);
            }
        });

        imgbtnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.badhabits);
            }
        });
    }
}
