package by.kurilo.musicplayer.userinterface.settings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SettingsTest {
    private Settings settings;
    @BeforeEach
    void setUp()
    {
        settings = new Settings();
    }
    @Test
    void testChangeTheme() {

        settings.changeTheme("Dark");
        assertEquals("Dark", settings.getTheme());
    }
}
