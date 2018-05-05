package com.example.bianc.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class DanceMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs with song name and artist.
        final ArrayList<Songs> danceSongs = new ArrayList<Songs>();
        danceSongs.add(new Songs(getString(R.string.first_dance_song), getString(R.string.artist_first_dance_song), R.drawable.everybody_hates_me));
        danceSongs.add(new Songs(getString(R.string.second_dance_song), getString(R.string.artist_second_dance_song), R.drawable.lonely_together));
        danceSongs.add(new Songs(getString(R.string.third_dance_song), getString(R.string.artist_third_dance_song), R.drawable.i_like_me_better));
        danceSongs.add(new Songs(getString(R.string.fourth_dance_song), getString(R.string.artist_fourth_dance_song), R.drawable.el_bano));
        danceSongs.add(new Songs(getString(R.string.fifth_dance_song), getString(R.string.artist_fifth_dance_song), R.drawable.more_than_you_know));

        // Create an {@link SongsAdapter}, whose data source is a list of {@link Songs}. The
        // adapter knows how to create list items for each item in the list.
        SongsAdapter adapter = new SongsAdapter(this, danceSongs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.song_list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // set OnClickListener on each song from list view to open NowPlaying activity.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(DanceMusicActivity.this, NowPlaying.class);
                intent.putExtra("Example item", danceSongs.get(position));

                startActivity(intent);

            }
        });
    }
}
