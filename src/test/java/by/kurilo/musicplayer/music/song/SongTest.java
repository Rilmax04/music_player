package by.kurilo.musicplayer.music.song;

import by.kurilo.musicplayer.music.album.Album;
import by.kurilo.musicplayer.music.artist.Artist;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SongTest {
    private Artist artist;
    private Album album;
    private Song song;

    @BeforeEach
    public void setUp() {
        artist = new Artist("Artist Name", "Pop");
        album = new Album("Album Title", 2023);
        song = new Song("Song Title", 240, artist, album);
    }

    @Test
    public void testGetTitle() {
        assertEquals("Song Title", song.getTitle());
    }

    @Test
    public void testGetDuration() {
        assertEquals(240, song.getDuration());
    }

    @Test
    public void testShowDetails() {
        song.showDetails(); // this will print out details
        // No assertion needed for printing, but you could capture the output if needed
    }

    @Test
    public void testGetArtist() {
        assertEquals(artist, song.getArtist());
    }

    @Test
    public void testGetAlbum() {
        assertEquals(album, song.getAlbum());
    }
}