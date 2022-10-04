package ru.sobornov.spring.basic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        context.close();
    }
}
