package com.pregveda.devfest.pregveda;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.view.View;
/**
 * Created by user on 12/27/15.
 */
public class meditation extends Activity {

    ImageButton imgBtn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meditation);


        imgBtn = (ImageButton) findViewById(R.id.medhome_btn);

        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }
        });

    }


}
