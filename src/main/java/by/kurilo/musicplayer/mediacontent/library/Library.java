package by.kurilo.musicplayer.mediacontent.library;

import by.kurilo.musicplayer.mediacontent.playlist.Playlist;
import by.kurilo.musicplayer.music.song.Song;

import java.util.List;

public class Library {
    private List<Playlist> playlists;
    private List<Song> allSongs;

    public void addSongToLibrary(Song song) {
        allSongs.add(song);
        System.out.println("Song added to library: " + song.getTitle());
    }

    public List<Song> getAllSongs() {
        return allSongs;
    }
    public void setAllSongs(List <Song> songList)
    {
        this.allSongs=songList;
    }

}
