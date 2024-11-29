package by.kurilo.musicplayer.userinterface.equalizer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EqualizerTest {
    private Equalizer equalizer;

    @BeforeEach
    void setUp() {
        equalizer = new Equalizer();
    }

    @Test
    void testApplyPreset() {
        equalizer.applyPreset("Rock");
        assertEquals("Rock", equalizer.getPreset(), "Preset should be 'Rock'");
    }

    @Test
    void testAdjustBassBand() {
        equalizer.adjustBand("Bass", 5);
        assertEquals(5, equalizer.getBandGain("Bass"), "Bass gain should be 5 dB");
    }

    @Test
    void testAdjustMidBand() {
        equalizer.adjustBand("Mid", -3);
        assertEquals(-3, equalizer.getBandGain("Mid"), "Mid gain should be -3 dB");
    }

    @Test
    void testAdjustTrebleBand() {
        equalizer.adjustBand("Treble", 7);
        assertEquals(7, equalizer.getBandGain("Treble"), "Treble gain should be 7 dB");
    }

    @Test
    void testAdjustNonExistingBand() {
        equalizer.adjustBand("Unknown", 4);
        assertEquals(4, equalizer.getBandGain("Unknown"), "Unknown band gain should be 4 dB");
    }
}