package by.kurilo.musicplayer.user;

import by.kurilo.musicplayer.mediacontent.playlist.Playlist;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    private User user;
    private Playlist playlist;

    @BeforeEach
    public void setUp() {
        user = new User("TestUser");
        playlist = new Playlist("My Playlist");
    }

    @Test
    public void testCreatePlaylist() {
        user.createPlaylist("Test Playlist");
        assertEquals(1, user.getPlaylists().size());
        assertEquals("Test Playlist", user.getPlaylists().get(0).getName());
    }

    @Test
    public void testDeletePlaylist() {
        user.createPlaylist("Test Playlist");
        Playlist playlistToDelete = user.getPlaylists().get(0);
        user.deletePlaylist(playlistToDelete);
        assertTrue(user.getPlaylists().isEmpty());
    }

    @Test
    public void testShowPlaylists() {
        user.createPlaylist("Test Playlist");
        user.createPlaylist("Another Playlist");
        assertEquals(2, user.getPlaylists().size());
    }

    @Test
    public void testGetPlaylists() {
        user.createPlaylist("Test Playlist");
        assertNotNull(user.getPlaylists());
        assertEquals(1, user.getPlaylists().size());
    }
    @Test
    void testShowFileInfo() {
        assertDoesNotThrow(() -> {
            user.showPlaylists();
        });
    }
}
