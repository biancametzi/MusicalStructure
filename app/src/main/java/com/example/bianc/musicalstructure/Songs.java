package com.example.bianc.musicalstructure;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * {@link Songs} represents the song name and artist name of a song.
 */

public class Songs implements Parcelable{

    /** Represents the song name */
    private String mSongName;

    /** Represents the song artist */
    private String mSongArtist;

    /** Represents the image of the song */
    private int mImageSong;

    /** Create a new song object
     * @param songName is the name of the sont
     * @param songArtist is the artist of the song
     */

    public Songs(String songName, String songArtist, int imageSong) {
        mSongName = songName;
        mSongArtist = songArtist;
        mImageSong = imageSong;
    }

    protected Songs(Parcel in) {
        mSongName = in.readString();
        mSongArtist = in.readString();
        mImageSong = in.readInt();
    }

    public static final Creator<Songs> CREATOR = new Creator<Songs>() {
        @Override
        public Songs createFromParcel(Parcel in) {
            return new Songs(in);
        }

        @Override
        public Songs[] newArray(int size) {
            return new Songs[size];
        }
    };

    /**
     * Get the name of the song.
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the artist of the song.
     */
    public String getSongArtist() {
        return mSongArtist;
    }

    /**
     * Get the image of the song.
     */
    public int getImageSong() {
        return mImageSong;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mSongName);
        dest.writeString(mSongArtist);
        dest.writeInt(mImageSong);
    }
}