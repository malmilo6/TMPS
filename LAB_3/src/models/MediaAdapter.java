package models;
import domain.MediaImpl;

public class MediaAdapter implements MediaImpl {
    MP3Player mp3Player = new MP3Player();
    @Override
    public void play() {
        mp3Player.playMP3();
    }
}
