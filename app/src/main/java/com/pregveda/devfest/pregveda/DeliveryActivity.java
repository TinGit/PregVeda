package com.pregveda.devfest.pregveda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DeliveryActivity extends AppCompatActivity {

    ImageButton imgbtnDeliHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);
        imgbtnDeliHome=(ImageButton)findViewById(R.id.imgbtnDeliHome);
        imgbtnDeliHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
