package com.pregveda.devfest.pregveda;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class musicAcitivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private TextView songName, songDuration;
    private SeekBar seekBar;
    private double timeStart = 0, finalTime = 0;
    private int forwardTime = 2000, backwardTime = 2000;
    private Handler durationHandler = new Handler();

    //play button
    private ImageButton btnPlay;




        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
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

        private Runnable updateSeekBarTime = new Runnable() {
            public void run() {
                timeStart = mediaPlayer.getCurrentPosition();
                seekBar.setProgress((int) timeStart);
                double timeRemaining = finalTime - timeStart;
                songDuration.setText(String.format("%d min, %d sec", TimeUnit.MILLISECONDS.toMinutes((long) timeRemaining), TimeUnit.MILLISECONDS.toSeconds((long) timeRemaining) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) timeRemaining))));
                durationHandler.postDelayed(this, 100);
            }
        };
    public void play(View view) {
        mediaPlayer.start();
        timeStart = mediaPlayer.getCurrentPosition();
        seekBar.setProgress((int) timeStart);
        durationHandler.postDelayed(updateSeekBarTime, 100);
    }
    public void pause(View view) {
        mediaPlayer.pause();
    }
    public void forward(View view) {
        if ((timeStart + forwardTime) <= finalTime) {
            timeStart = timeStart - backwardTime;
            mediaPlayer.seekTo((int) timeStart);
        }
    }
    public void backforward(View view) {
        //check if we can go back at backwardTime seconds after song starts
        if ((timeStart - backwardTime) > 0) {
            timeStart = timeStart - backwardTime;
            mediaPlayer.seekTo((int) timeStart);
        }
    }



    }


