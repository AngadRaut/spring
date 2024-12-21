package org.example.singletonVsPrototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        School school = context.getBean("school", School.class);
        School school2 = context.getBean("school", School.class);

        System.out.println(school.getStudent());
        System.out.println(school.getStudent());

    }
}
