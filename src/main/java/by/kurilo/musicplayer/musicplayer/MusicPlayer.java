package by.kurilo.musicplayer.musicplayer;

import by.kurilo.musicplayer.mediacontent.playlist.Playlist;
import by.kurilo.musicplayer.user.User;

public class MusicPlayer {
    private String name;
    private Playlist currentPlaylist;
    private User currentUser;
    private boolean isPlaying;
    private int volume;

    public MusicPlayer(String name) {
        this.name = name;
        this.isPlaying = false;
        this.volume = 50;
    }

    public void play() {
        if (currentPlaylist != null) {
            isPlaying = true;
            System.out.println("Playing: " + currentPlaylist.getCurrentSong().getTitle());
        }
    }

    public void stop() {
        isPlaying = false;
        System.out.println("Playback stopped.");
    }

    public void adjustVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume set to: " + volume);
    }

    public void loadPlaylist(Playlist playlist) {
        this.currentPlaylist = playlist;
        System.out.println("Loaded playlist: " + playlist.getName());
    }

    public void showCurrentSong() {
        System.out.println("Current song: " + currentPlaylist.getCurrentSong().getTitle());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Playlist getCurrentPlaylist() {
        return currentPlaylist;
    }


    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public int getVolume() {
        return volume;
    }


}