package com.example.android.bluetoothchat;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;

class PlayMusic implements View.OnClickListener{
    private Context context;
    public PlayMusic(Context context){
        this.context = context;
    }
    @Override
    public void onClick(View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.in_call_alarm);
        mediaPlayer.start();
    }
}