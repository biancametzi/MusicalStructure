package com.example.bianc.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PopMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs with song name and artist.
        final ArrayList<Songs> popSongs = new ArrayList<Songs>();
        popSongs.add(new Songs(getString(R.string.first_pop_song), getString(R.string.artist_first_pop_song), R.drawable.shape_of_you));
        popSongs.add(new Songs(getString(R.string.second_pop_song), getString(R.string.artist_second_pop_song), R.drawable.thunder));
        popSongs.add(new Songs(getString(R.string.third_pop_song), getString(R.string.artist_third_pop_song), R.drawable.attention));
        popSongs.add(new Songs(getString(R.string.fourth_pop_song), getString(R.string.artist_fourth_pop_song), R.drawable.dusk_till_dawn));
        popSongs.add(new Songs(getString(R.string.fifth_pop_song), getString(R.string.artist_fifth_pop_song), R.drawable.in_my_blood));

        // Create an {@link SongsAdapter}, whose data source is a list of {@link Songs}. The
        // adapter knows how to create list items for each item in the list.
        SongsAdapter adapter = new SongsAdapter(this, popSongs);

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
                Intent intent = new Intent(PopMusicActivity.this, NowPlaying.class);
                intent.putExtra("Example item", popSongs.get(position));

                startActivity(intent);

            }
        });
    }
}

