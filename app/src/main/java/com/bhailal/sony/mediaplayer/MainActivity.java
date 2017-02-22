package com.bhailal.sony.mediaplayer;

import android.media.MediaPlayer;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn= (Button)findViewById(R.id.button);
        ImageView img = (ImageView)findViewById(R.id.img1);
        final MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.laalishq);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying() == true) {
                    // Pause the music player
                    btn.setBackgroundResource(R.drawable.mystop);
                    mp.pause();
                }
                    // If it's not playing
                else {
                    // Resume the music player
                    btn.setBackgroundResource(R.drawable.mystart);

                    mp.start();
                }

            }
        });


    }
}
