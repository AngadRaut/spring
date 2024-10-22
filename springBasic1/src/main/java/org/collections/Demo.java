package org.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collection.config.xml");
        Emp e1 = (Emp)context.getBean("emp1");
        System.out.println(e1);
    }
}
