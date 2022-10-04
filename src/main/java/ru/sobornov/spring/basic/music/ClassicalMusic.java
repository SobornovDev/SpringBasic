package ru.sobornov.spring.basic.music;

/**
 * @author : Sobornov Vladimir
 * @since : 05.10.2022
 **/
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Hungarian Rhapsodies";
    }
}
