package org.constructor_ref_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor_injection.xml");
        //Abc abc = (Abc) context.getBean(Abc.class);
        Abc abc = (Abc) context.getBean("fir");
        System.out.println(abc);
    }
}
