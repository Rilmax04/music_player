package by.kurilo.musicplayer.userinterface.settings;

public class Settings {
    private int defaultVolume;
    private String theme;

    public void changeTheme(String theme) {
        this.theme = theme;
        System.out.println("Theme changed to: " + theme);
    }

    public String getTheme() {
        return theme;
    }
}