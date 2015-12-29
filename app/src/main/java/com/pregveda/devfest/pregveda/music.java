package com.pregveda.devfest.pregveda;

/**
 * Created by Mike on 12/26/2015.
 */

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

public class music extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private TextView songName, songDuration;
    private SeekBar seekBar;
    private double timeStart = 0, finalTime = 0;



    //play button
    private ImageButton btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.musiclay);
        songName = (TextView) findViewById(R.id.songName);
        songDuration = (TextView) findViewById(R.id.songDuration);
        mediaPlayer = MediaPlayer.create(this, R.raw.garbhsanskar);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        songName.setText("garbhsanskar.mp3");
        seekBar.setMax((int) finalTime);
        seekBar.setClickable(false);

        //play button
        btnPlay=(ImageButton)findViewById(R.id.btn_Play);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v);
            }
        });
    }


    public void play(View view) {
        mediaPlayer.start();
        timeStart = mediaPlayer.getCurrentPosition();
        seekBar.setProgress((int) timeStart);

    }

}
