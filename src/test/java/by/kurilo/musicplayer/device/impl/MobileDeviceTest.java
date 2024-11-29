package by.kurilo.musicplayer.device.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MobileDeviceTest {
    private MobileDevice mobile;
    @BeforeEach
    void setUp()
    {
        mobile = new MobileDevice("PhoneX", "BrandY");
    }
    @Test
    void testConnectToPlayer() {

        mobile.connectToPlayer();
        assertTrue(mobile.isConnected());
    }
}