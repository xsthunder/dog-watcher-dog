package com.example.android.bluetoothchat;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.View;

import static com.example.android.bluetoothchat.MainActivity.TAG;

class PlayMusic implements View.OnClickListener{
    private Context context;
    public PlayMusic(Context context){
        this.context = context;
    }
    @Override
    public void onClick(View v){
        if(context==null){
            Log.e(TAG, "onClick: null context" );
            return;
        }
        MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.in_call_alarm);
        mediaPlayer.start();
    }
}