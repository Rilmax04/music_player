package by.kurilo.musicplayer.mediacontent.playlist;

import by.kurilo.musicplayer.music.song.Song;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private final String name;
    private final List<Song> songs;
    private int currentSongIndex;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
        this.currentSongIndex = 0;
    }

    public void addSong(Song song) {
        songs.add(song);
        System.out.println(song.getTitle() + " added to playlist.");
    }

    public Song getCurrentSong() {
        return songs.get(currentSongIndex);
    }

    public void nextSong() {
        currentSongIndex = (currentSongIndex + 1) % songs.size();
        System.out.println("Next song: " + getCurrentSong().getTitle());
    }

    public void removeSong(Song song) {
        songs.remove(song);
        System.out.println(song.getTitle() + " removed from playlist.");
    }

    public String getName() {
        return name;
    }

    public int getTotalSongs() {
        return songs.size();
    }
}
