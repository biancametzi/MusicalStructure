package com.example.bianc.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the pop music category.
        TextView popSongs = (TextView) findViewById(R.id.pop_songs);

        // Set a click listener on that View.
        popSongs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the pop music category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PopMusicActivity).
                Intent popIntent = new Intent(MainActivity.this, PopMusicActivity.class);

                // Start the new activity.
                startActivity(popIntent);
            }
        });

        // Find the View that shows the rock music category.
        TextView rockSongs = (TextView) findViewById(R.id.rock_songs);

        // Set a click listener on that View.
        rockSongs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the rock music category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RockMusicActivity}.
                Intent rockIntent = new Intent(MainActivity.this, RockMusicActivity.class);

                // Start the new activity.
                startActivity(rockIntent);
            }
        });

        // Find the View that shows the dance music category.
        TextView danceSongs = (TextView) findViewById(R.id.dance_songs);

        // Set a click listener on that View.
        danceSongs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the dance music category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link DanceMusicActivity}.
                Intent danceIntent = new Intent(MainActivity.this, DanceMusicActivity.class);

                // Start the new activity.
                startActivity(danceIntent);
            }
        });
    }
}
