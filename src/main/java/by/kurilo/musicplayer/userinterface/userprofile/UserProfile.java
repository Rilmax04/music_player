package by.kurilo.musicplayer.userinterface.userprofile;

import by.kurilo.musicplayer.user.User;

public class UserProfile {
    private User user;
    private String profilePicture;
    private String status;

    public UserProfile(User user,String profilePicture)
    {
        this.user=user;
        this.profilePicture=profilePicture;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Status updated to: " + newStatus);
    }

    public String getStatus() {
        return status;
    }
}
