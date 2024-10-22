package org.constructor_ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.constructor.xml");
        Person p = (Person) context.getBean("person1");
        System.out.println(p);
    }
}
