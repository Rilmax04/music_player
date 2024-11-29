package by.kurilo.musicplayer.mediacontent.library;

import by.kurilo.musicplayer.music.album.Album;
import by.kurilo.musicplayer.music.artist.Artist;
import by.kurilo.musicplayer.music.song.Song;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private Library library;
    private Song song1;
    private Song song2;

    @BeforeEach
    void setUp() {
        List<Song> songList = new ArrayList<>();
        library = new Library();
        song1 = new Song("Song One", 210, new Artist("Artist One", "Rock"), new Album("Album One", 2020));
        song2 = new Song("Song Two", 180, new Artist("Artist Two", "Pop"), new Album("Album Two", 2021));

        library.setAllSongs(songList);
    }

    @Test
    void testAddSongToLibrary() {
        library.addSongToLibrary(song1);
        assertEquals(1, library.getAllSongs().size(), "Library should contain one song.");
        assertEquals("Song One", library.getAllSongs().getFirst().getTitle(), "First song should be 'Song One'.");
    }

    @Test
    void testGetAllSongs() {
        library.addSongToLibrary(song1);
        library.addSongToLibrary(song2);

        assertEquals(2, library.getAllSongs().size(), "Library should contain two songs.");
    }

    @Test
    void testEmptyLibrary() {
        assertTrue(library.getAllSongs().isEmpty(), "Library should be empty initially.");
    }

}