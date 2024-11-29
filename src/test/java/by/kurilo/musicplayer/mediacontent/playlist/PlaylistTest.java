package by.kurilo.musicplayer.mediacontent.playlist;

import by.kurilo.musicplayer.music.album.Album;
import by.kurilo.musicplayer.music.artist.Artist;
import by.kurilo.musicplayer.music.song.Song;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlaylistTest {
    private Playlist playlist;
    private Song song;

    @BeforeEach
    void setUp() {
        playlist = new Playlist("My Playlist");
        song = new Song("Song1", 200, new Artist("Artist1", "Pop"), new Album("Album1", 2021));
    }

    @Test
    void testAddSong() {
        playlist.addSong(song);
        assertEquals(1, playlist.getTotalSongs());
    }

    @Test
    void testRemoveSong() {
        playlist.addSong(song);
        playlist.removeSong(song);
        assertEquals(0, playlist.getTotalSongs());
    }

    @Test
    void testNextSong() {
        Song song2 = new Song("Song2", 220, new Artist("Artist2", "Pop"), new Album("Album2", 2022));
        playlist.addSong(song);
        playlist.addSong(song2);
        playlist.nextSong();
        assertEquals("Song2", playlist.getCurrentSong().getTitle());
    }
    @Test
    void testGetName (){
        assertEquals("My Playlist", playlist.getName());
    }
}