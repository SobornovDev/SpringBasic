package ru.sobornov.spring.basic.player;

import ru.sobornov.spring.basic.music.Music;

/**
 * @author : Sobornov Vladimir
 * @since : 05.10.2022
 **/
public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music; //IoC
    }

    public void getMusic() {
        System.out.println("Playing: " + music.getSong());
    }


}
