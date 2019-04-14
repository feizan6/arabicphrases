package com.example.fayzan.arabicbasicphrases;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

//    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClickPlay(View view) {

        // ** A BETTER SOLUTION **
        // In this we are simply setting the button id to c
        // correspond to the raw file id and linking the two.



        int id = view.getId();
        String ourId= "";

        ourId = view.getResources().getResourceEntryName(id);

        int resourceId = getResources().getIdentifier(ourId, "raw", "com.example.fayzan.arabicbasicphrases");

        MediaPlayer mediaPlayer = MediaPlayer.create(this, resourceId);
        mediaPlayer.start();

        Log.i("ID : ", ourId);

        // MY SOLUTION
//        Button playAudio = (Button) view;
//
//        int tag = Integer.parseInt(playAudio.getTag().toString());
//
//        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
//            mediaPlayer.stop();
//        }
//
//        switch (tag) {
//            case 1:
//                mediaPlayer = MediaPlayer.create(this, R.raw.arabicone);
//                break;
//            case 2:
//                mediaPlayer = MediaPlayer.create(this, R.raw.arabictwo);
//                break;
//            case 3:
//                mediaPlayer = MediaPlayer.create(this, R.raw.arabicthree);
//                break;
//            case 4:
//                mediaPlayer = MediaPlayer.create(this, R.raw.arabicfour);
//                break;
//            case 5:
//                mediaPlayer = MediaPlayer.create(this, R.raw.arabicfive);
//                break;
//            case 6:
//                mediaPlayer = MediaPlayer.create(this, R.raw.arabicsix);
//                break;
//            case 7:
//                mediaPlayer = MediaPlayer.create(this, R.raw.arabicseven);
//                break;
//            case 8:
//                mediaPlayer = MediaPlayer.create(this, R.raw.arabiceight);
//                break;
//        }
//        mediaPlayer.start();


    }
}
