package org.example.singletonVsPrototype.lookupAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        Samosa school = context.getBean("samosa", Samosa.class);
        Samosa school2 = context.getBean("samosa", Samosa.class);

        System.out.println(school.getPrice());
        System.out.println(school.getPrice());
    }
}
