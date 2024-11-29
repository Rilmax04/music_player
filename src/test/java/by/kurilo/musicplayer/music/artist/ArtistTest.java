package by.kurilo.musicplayer.music.artist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArtistTest {
    private Artist artist;

    @BeforeEach
    void setUp() {
        artist = new Artist("TestArtist", "Rock");
    }

    @Test
    void testGetName() {
        assertEquals("TestArtist", artist.getName());
    }

    @Test
    void testShowInfo() {
        assertDoesNotThrow(() -> {
            artist.showInfo();
        });
    }
}