package com.blogspot.psbapplications.block4;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this, R.raw.piano);

        Switch loopingMusic =findViewById(R.id.switchLooping);
        loopingMusic.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                mediaPlayer.setLooping(b);
            }
        });
    }
    public void playMusic(View view){
        mediaPlayer.start();
    }
    public void pauseMusic(View view) {
        if(mediaPlayer.isPlaying())
            mediaPlayer.pause();
    }

}