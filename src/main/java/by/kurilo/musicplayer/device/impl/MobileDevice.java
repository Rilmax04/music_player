package by.kurilo.musicplayer.device.impl;

import by.kurilo.musicplayer.device.Device;

public class MobileDevice extends Device {
    private boolean isConnected;

    public MobileDevice(String model, String manufacturer) {
        super();
        this.model=model;
        this.manufacturer=manufacturer;
    }

    public void connectToPlayer() {
        this.isConnected=true;
        System.out.println("Mobile device connected.");
    }
    public boolean isConnected()
    {
        return isConnected;
    }
}
