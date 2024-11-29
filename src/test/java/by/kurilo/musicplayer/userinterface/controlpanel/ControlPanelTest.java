package by.kurilo.musicplayer.userinterface.controlpanel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControlPanelTest {
    private ControlPanel panel;
    @BeforeEach
    void setup()
    {
        panel= new ControlPanel();
    }
    @Test
    void testPause() {

        panel.pause();
        assertTrue(panel.isPaused());
    }
    @Test
    void testShowFileInfo() {
        assertDoesNotThrow(() -> {
            panel.rewind();
        });
        assertFalse(panel.isPaused());
    }
}