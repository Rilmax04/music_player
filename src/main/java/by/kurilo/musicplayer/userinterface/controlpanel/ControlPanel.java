package by.kurilo.musicplayer.userinterface.controlpanel;

public class ControlPanel {

    private boolean isPause =false;

    public void pause() {
        isPause=true;
        System.out.println("Playback paused.");
    }

    public void rewind() {
        isPause=false;
        System.out.println("Rewind playback.");
    }

    public boolean isPaused() {
        return isPause;
    }
}
