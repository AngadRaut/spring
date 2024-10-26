package org.standalone_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.standalone.xml");
        Student student =(Student) context.getBean("student1");
        System.out.println(student);
    }
}
