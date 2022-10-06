package ru.sobornov.spring.basic.music;

/**
 * @author : Sobornov Vladimir
 * @since : 05.10.2022
 **/
public class ClassicalMusic implements Music{

    private void doInit() {
        System.out.println("init method");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsodies";
    }

    private void doDestroy() {
        System.out.println("destroy method");
    }
}
