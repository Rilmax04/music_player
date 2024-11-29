package by.kurilo.musicplayer.musicplayer;

import by.kurilo.musicplayer.music.album.Album;
import by.kurilo.musicplayer.music.artist.Artist;
import by.kurilo.musicplayer.music.song.Song;
import by.kurilo.musicplayer.mediacontent.playlist.Playlist;
import by.kurilo.musicplayer.user.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MusicPlayerTest {
    private MusicPlayer player;
    private Playlist playlist;
    private User user;
    private Song song;
    private Artist artist;
    private Album album;

    @BeforeEach
    void setUp() {
        player = new MusicPlayer("TestPlayer");
        artist = new Artist("TestArtist", "TestGenre");
        album = new Album("TestAlbum", 2024);
        song = new Song("TestSong", 180, artist, album);
        playlist = new Playlist("TestPlaylist");
        playlist.addSong(song);
        user = new User("TestUser");
    }

    @Test
    void testPlay() {
        player.loadPlaylist(playlist);
        player.play();
        assertTrue(player.isPlaying());
    }

    @Test
    void testStop() {
        player.loadPlaylist(playlist);
        player.play();
        player.stop();
        assertFalse(player.isPlaying());
    }

    @Test
    void testAdjustVolume() {
        player.adjustVolume(75);
        assertEquals(75, player.getVolume());
    }

    @Test
    void testLoadPlaylist() {
        player.loadPlaylist(playlist);
        assertEquals(playlist, player.getCurrentPlaylist());
    }

    @Test
    void testShowCurrentSong() {
        player.loadPlaylist(playlist);
        assertDoesNotThrow(() -> player.showCurrentSong());
    }

    @Test
    void testSetCurrentUser() {
        player.setCurrentUser(user);
        assertEquals(user, player.getCurrentUser());
    }

    @Test
    void testSetName() {
        player.setName("NewName");
        assertEquals("NewName", player.getName());
    }

    @Test
    void testSetPlaying() {
        player.setPlaying(true);
        assertTrue(player.isPlaying());
    }
}