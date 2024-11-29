package by.kurilo.musicplayer.music.album;

import by.kurilo.musicplayer.music.artist.Artist;
import by.kurilo.musicplayer.music.song.Song;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class AlbumTest {
    private Album album;
    private Song song;
    private Artist artist;

    @BeforeEach
    void setUp() {
        album = new Album("TestAlbum", 2024);
        artist = new Artist("TestArtist", "TestGenre");
        song = new Song("TestSong", 180, artist, album);
    }

    @Test
    void testAddSong() {
        album.addSong(song);
        List<Song> songs = album.getSongs();
        assertFalse(songs.isEmpty());
        assertEquals(1, songs.size());
        assertEquals(song, songs.getFirst());
    }

    @Test
    void testGetTitle() {
        assertEquals("TestAlbum", album.getTitle());
    }

    @Test
    void testGetSongsEmptyInitially() {
        assertTrue(album.getSongs().isEmpty());
    }

    @Test
    void testShowAlbumInfo() {
        assertDoesNotThrow(() -> album.showAlbumInfo());
    }
}