package by.kurilo.musicplayer.mediacontent.playbackhistory;

import by.kurilo.musicplayer.user.User;
import by.kurilo.musicplayer.music.song.Song;

import java.util.ArrayList;
import java.util.List;

public class PlaybackHistory {
    private User user;
    private final List<Song> recentlyPlayed;

    public PlaybackHistory (User user)
    {
        this.user=user;
        this.recentlyPlayed = new ArrayList<>();
    }
    public void addSongToHistory(Song song) {
        recentlyPlayed.add(song);
    }
    public void showHistory() {
        for (Song song : recentlyPlayed) {
            System.out.println("Played: " + song.getTitle());
        }
    }
    public List<Song> getRecentlyPlayed()
    {
        return recentlyPlayed;
    }

}
