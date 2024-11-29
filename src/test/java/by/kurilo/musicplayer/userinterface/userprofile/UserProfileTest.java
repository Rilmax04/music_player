package by.kurilo.musicplayer.userinterface.userprofile;

import by.kurilo.musicplayer.user.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class UserProfileTest {
    private UserProfile userProfile;

    @BeforeEach
    public void setUp() {
        User user = new User("TestUser");
        userProfile = new UserProfile(user, "profilePic.png");
    }

    @Test
    public void testUpdateStatus() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String newStatus = "Feeling Happy!";
        userProfile.updateStatus(newStatus);

        String expectedOutput = "Status updated to: " + newStatus + "\n";

        assertEquals(newStatus, userProfile.getStatus());

        System.setOut(System.out);
    }
    @Test
    public void testGetStatus() {

        String expectedStatus = "Feeling Happy!";
        userProfile.updateStatus(expectedStatus);

        String actualStatus = userProfile.getStatus();

        assertEquals(expectedStatus, actualStatus);
    }
}