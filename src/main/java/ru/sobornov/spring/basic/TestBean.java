package ru.sobornov.spring.basic;

/**
 * @author : Sobornov Vladimir
 * @since : 04.10.2022
 **/
public class TestBean {

    private String name;

    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
