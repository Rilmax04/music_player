package by.kurilo.musicplayer.mediacontent.audiofile;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AudioFileTest {
    private AudioFile file;
    @BeforeEach
    void setUp() {
         file = new AudioFile("song.mp3", 5.0);;
    }
    @Test
    void testGetName (){
        assertEquals("song.mp3", file.getFileName());
    }
    @Test
    void testShowFileInfo() {
        assertDoesNotThrow(() -> {
            file.showFileInfo();
        });
    }
}
