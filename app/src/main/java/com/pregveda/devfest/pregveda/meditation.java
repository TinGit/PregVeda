package com.pregveda.devfest.pregveda;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.view.View;
/**
 * Created by user on 12/27/15.
 */
public class meditation extends Activity {

    ImageButton medhome_btn;

    ImageButton imgbtnHome;
    ImageButton imgbtnNext;
    ImageButton imgbtnPrev;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.meditation);


        imgbtnHome = (ImageButton) findViewById(R.id.imgbtnHome);

        imgbtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }


}
