package com.pregveda.devfest.pregveda;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by TinbitKassahun on 12/28/2015.
 */
public class sanitation extends Activity {

    ImageButton imgBtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.sanitation);


        imgBtn = (ImageButton) findViewById(R.id.sanitation_home);

        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }
        });

    }
}
