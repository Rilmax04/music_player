package by.kurilo.musicplayer.mediacontent.playbackhistory;

import by.kurilo.musicplayer.music.album.Album;
import by.kurilo.musicplayer.music.artist.Artist;
import by.kurilo.musicplayer.music.song.Song;
import by.kurilo.musicplayer.user.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class PlaybackHistoryTest {

    private User user;
    private PlaybackHistory playbackHistory;
    private Song song1;
    private Song song2;

    @BeforeEach
    void setUp() {
        user = new User("testUser");
        playbackHistory = new PlaybackHistory(user);

        song1 = new Song("Song One", 210, new Artist("Artist One", "Rock"), new Album("Album One", 2020));
        song2 = new Song("Song Two", 180, new Artist("Artist Two", "Pop"), new Album("Album Two", 2021));
    }

    @Test
    void testAddSongToHistory() {
        playbackHistory.addSongToHistory(song1);
        List<Song> history = playbackHistory.getRecentlyPlayed();

        assertEquals(1, history.size());
        assertEquals("Song One", history.get(0).getTitle());
    }

    @Test
    void testShowHistory() {
        playbackHistory.addSongToHistory(song1);
        playbackHistory.addSongToHistory(song2);

        playbackHistory.showHistory(); }

    @Test
    void testShowHistoryEmpty() {
        playbackHistory.showHistory();
    }
}