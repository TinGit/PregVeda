package com.pregveda.devfest.pregveda;

import android.os.Bundle;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;
    Button btnRest;
    Button btnAbd;
    Button btnRelax;
  //public TextView txtAbd;
    public Text txtA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lifestyle);
        btnRest = (Button) findViewById(R.id.rest);
        btnAbd = (Button) findViewById(R.id.abdominal);
        btnRelax=(Button) findViewById(R.id.relaxation);
        //txtAbd= (TextView) findViewById(R.id.abdominal_text);
   //     txtA= (Text) findViewById(R.id.abdominal_text);
 //       txtA.setTextContent("Jela Ras");
//        txtAbd.setText("This is a test text for Abdominal Breathing");
     //   imageButton = (ImageButton) findViewById(R.id.imageButton);
     //   setSupportActionBar(toolbar);

      /*  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

       /* imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/

        btnRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               setContentView(R.layout.rest);
            }
        });
        btnAbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //txtAbd.setText("This is a test text for Abdominal Breathing");
                setContentView(R.layout.abdominal_breathing);
            }
        });

       // txtAbd.setText("This is a test text for Abdominal Breathing");


        btnRelax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //txtAbd.setText("This is a test text for Abdominal Breathing");
                setContentView(R.layout.relaxation);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
