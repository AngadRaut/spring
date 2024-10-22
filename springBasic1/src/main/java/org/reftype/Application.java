package org.reftype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ref.config.xml");
        A obj1 = (A)context.getBean("a1");
        System.out.println(obj1);
    }
}
