package models;
import domain.Media;

public class MediaAdapter implements Media {
    MP3Player mp3Player = new MP3Player();
    @Override
    public void play() {
        mp3Player.playMP3();
    }
}
