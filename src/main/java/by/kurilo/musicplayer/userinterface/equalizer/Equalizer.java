package by.kurilo.musicplayer.userinterface.equalizer;

import java.util.HashMap;
import java.util.Map;

public class Equalizer {
    private String preset;
    private final Map<String, Integer> frequencyBands;

    public Equalizer() {
        frequencyBands = new HashMap<>();
        frequencyBands.put("Bass", 0);
        frequencyBands.put("Mid", 0);
        frequencyBands.put("Treble", 0);
    }

    public void applyPreset(String preset) {
        this.preset = preset;
        System.out.println("Equalizer preset applied: " + preset);
    }

    public void adjustBand(String band, int gain) {
        frequencyBands.put(band, gain);
        System.out.println(band + " adjusted to: " + gain + " dB");
    }

    public String getPreset() {
        return preset;
    }

    public int getBandGain(String band) {
        return frequencyBands.getOrDefault(band, 0);
    }

}
