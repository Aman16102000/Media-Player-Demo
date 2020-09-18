package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button start=findViewById(R.id.start);
        Button pause =findViewById(R.id.pause);
        mediaPlayer =MediaPlayer.create(this,R.raw.mahabharat);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                Toast.makeText(MainActivity.this,"play",Toast.LENGTH_LONG).show();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
                Toast.makeText(MainActivity.this,"paused",Toast.LENGTH_LONG).show();
            }
        });
    }
}