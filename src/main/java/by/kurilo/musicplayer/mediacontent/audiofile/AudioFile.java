package by.kurilo.musicplayer.mediacontent.audiofile;

public class AudioFile {
    private final String fileName;
    private final double fileSize; // в МБ

    public AudioFile(String fileName,double fileSize)
    {
        this.fileName=fileName;
        this.fileSize=fileSize;
    }


    public void showFileInfo() {
        System.out.println("File: " + fileName + ", Size: " + fileSize + "MB");
    }

    public String getFileName() {
        return fileName;
    }
}