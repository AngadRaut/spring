package org.example.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.AnnotationFilter;

public class TestSingleton {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
//        context.refresh();
        SingletonDemo obj1 = context.getBean("singletonDemo",SingletonDemo.class);
        SingletonDemo obj2 = context.getBean("singletonDemo",SingletonDemo.class);
        if(obj1==obj2){
            System.out.println("same object is returned");
        }
    }
}
