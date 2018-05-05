package com.example.bianc.musicalstructure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link SongsAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Songs} objects.
 */

public class SongsAdapter extends ArrayAdapter<Songs>{
    /**
     * Create a new {@link SongsAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param songs is the list of {@link Songs} to be displayed.
     */
    public SongsAdapter(Context context, ArrayList<Songs> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Songs} object located at this position in the list.
        Songs currentSongs = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song_name.
        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.song_name);
        // Get the song name from the currentSongs object and set this text on
        // the song name TextView.
        songNameTextView.setText(currentSongs.getSongName());

        // Find the TextView in the list_item.xml layout with the ID artist_name.
        TextView artistNameTextView = (TextView) listItemView.findViewById(R.id.artist_name);
        // Get the artist name from the currentSongs object and set this text on
        // the artist name TextView.
        artistNameTextView.setText(currentSongs.getSongArtist());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}