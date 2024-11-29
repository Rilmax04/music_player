package by.kurilo.musicplayer.music.song;

import by.kurilo.musicplayer.music.album.Album;
import by.kurilo.musicplayer.music.artist.Artist;

public class Song {
    private final String title;
    private final int duration;
    private final Artist artist;
    private final Album album;

    public Song(String title, int duration, Artist artist, Album album) {
        this.title = title;
        this.duration = duration;
        this.artist = artist;
        this.album = album;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public void showDetails() {
        System.out.println("Title: " + title + ", Artist: " + artist.getName() + ", Album: " + album.getTitle());
    }

    public Artist getArtist() {
        return artist;
    }

    public Album getAlbum() {
        return album;
    }
}