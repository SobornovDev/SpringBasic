package ru.sobornov.spring.basic.player;

import ru.sobornov.spring.basic.music.Music;

/**
 * @author : Sobornov Vladimir
 * @since : 05.10.2022
 **/
public class MusicPlayer {
    private Music music;
    private int volume;

    public MusicPlayer(Music music) {
        this.music = music; //IoC
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void getMusic() {
        System.out.println("Playing: " + music.getSong() + "\n" + "Volume: " + volume);
    }


}
