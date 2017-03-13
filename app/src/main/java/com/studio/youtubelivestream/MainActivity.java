package com.studio.youtubelivestream;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Button nextBUtton = (Button)findViewById(R.id.next);
        String YoutubeAPIKey = "AIzaSyAyEehH6DsKNqiYJsAO84ay7mr2x_32XR0";
        setContentView(R.layout.activity_main);
        YouTubePlayerView youTubeView = (YouTubePlayerView) findViewById(R.id.youtubeplayer);
        youTubeView.initialize(YoutubeAPIKey, this);
//        nextBUtton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        Toast.makeText(this, "Done",Toast.LENGTH_LONG).show();
        youTubePlayer.loadVideo("7F37r50VUTQ");
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(this, "Oh no!"+youTubeInitializationResult.toString(),Toast.LENGTH_LONG).show();
    }
}
