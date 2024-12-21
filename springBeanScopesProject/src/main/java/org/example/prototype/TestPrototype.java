package org.example.prototype;

import org.example.singleton.SingletonDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrototype {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(PrototypeDemo.class);
//        context.refresh();
        PrototypeDemo obj1 = context.getBean("prototypeDemo", PrototypeDemo.class);
        PrototypeDemo obj2 = context.getBean("prototypeDemo", PrototypeDemo.class);
        if(obj1==obj2){
            System.out.println("same object is returned");
        }else {
            System.out.println("objects are different");
        }
      /*  ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        PrototypeDemo obj1 = context.getBean("prototypeDemo", PrototypeDemo.class);
        PrototypeDemo obj2 = context.getBean("prototypeDemo", PrototypeDemo.class);
        if(obj1==obj2){
            System.out.println("same object is returned");
        }else {
            System.out.println("objects are different");
        }*/
    }
}
