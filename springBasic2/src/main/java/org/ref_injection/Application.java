package org.ref_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ref_type_injection.xml");
        Student student1 = (Student) context.getBean("stu1");
        System.out.println(student1);
    }
}
