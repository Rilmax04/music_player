package by.kurilo.musicplayer.music.artist;

public class Artist {
    private final String name;
    private final String genre;

    public Artist(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void showInfo() {
        System.out.println("Artist: " + name + ", Genre: " + genre);
    }
}
