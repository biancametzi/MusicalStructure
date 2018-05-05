package com.example.bianc.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlaying extends AppCompatActivity implements View.OnClickListener {

    private ImageView mPlay;
    private ImageView mRewind;
    private ImageView mForward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Find the ID for each button and set onClickListener
        mPlay = findViewById(R.id.play_button);
        mPlay.setOnClickListener(this);

        mRewind = findViewById(R.id.rewind_button);
        mRewind.setOnClickListener(this);

        mForward = findViewById(R.id.forward_button);
        mForward.setOnClickListener(this);

        Intent intent = getIntent();
        Songs exampleItem = intent.getParcelableExtra("Example item");

        int songImage = exampleItem.getImageSong();
        String songName = exampleItem.getSongName();
        String artistName = exampleItem.getSongArtist();

        ImageView songImageView = findViewById(R.id.song_image);
        songImageView.setImageResource(songImage);

        TextView songNameTextView = findViewById(R.id.song_name);
        songNameTextView.setText(songName);

        TextView songArtistTextView = findViewById(R.id.artist_name);
        songArtistTextView.setText(artistName);
    }

    @Override
    public void onClick(View v) {

        if (v.equals(mPlay)) {

            Toast.makeText(NowPlaying.this, getString(R.string.play_toast), Toast.LENGTH_SHORT).show();
        }

        if (v.equals(mRewind)) {
            Toast.makeText(NowPlaying.this, getString(R.string.rewind_toast), Toast.LENGTH_SHORT).show();
        }

        if (v.equals(mForward)) {
            Toast.makeText(NowPlaying.this, getString(R.string.forward_toast), Toast.LENGTH_SHORT).show();
        }
    }

}

