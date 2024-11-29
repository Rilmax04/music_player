package by.kurilo.musicplayer.music.album;

import by.kurilo.musicplayer.music.song.Song;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private final String title;
    private final int year;
    private final List<Song> songs;

    public Album(String title, int year) {
        this.title = title;
        this.year = year;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }


    public void showAlbumInfo() {
        System.out.println("Album: " + title + ", Year: " + year);
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String getTitle() {
        return title;
    }
}
