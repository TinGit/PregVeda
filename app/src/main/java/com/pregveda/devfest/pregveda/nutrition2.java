package com.pregveda.devfest.pregveda;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Fri4A on 12/27/2015.
 */

public class nutrition2 extends Activity {

    TextView textn1;
    /**
     * Called when the activity is first created.
     */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nutrition2);
        textn1 = (TextView) findViewById(R.id.textViewn1);
        Button next = (Button) findViewById(R.id.button2);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
               /* Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
                */
                textn1.setText("Hello");
            }

        });
    }
}
