package by.kurilo.musicplayer.user;

import by.kurilo.musicplayer.mediacontent.playlist.Playlist;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String username;
    private final List<Playlist> playlists;

    public User(String username) {
        this.username = username;
        this.playlists = new ArrayList<>();
    }

    public void createPlaylist(String name) {
        playlists.add(new Playlist(name));
        System.out.println("Playlist created: " + name);
    }

    public void deletePlaylist(Playlist playlist) {
        playlists.remove(playlist);
        System.out.println("Playlist deleted: " + playlist.getName());
    }

    public void showPlaylists() {
        System.out.println("Playlists of " + username + ":");
        for (Playlist playlist : playlists) {
            System.out.println("- " + playlist.getName());
        }
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }
}
