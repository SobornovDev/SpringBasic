package ru.sobornov.spring.basic;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.sobornov.spring.basic.music.Music;
import ru.sobornov.spring.basic.player.MusicPlayer;

/**
 * @author : Sobornov Vladimir
 * @since : 04.10.2022
 **/
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());

//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer player = new MusicPlayer(music);
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.getMusic();
        context.close();
    }
}
