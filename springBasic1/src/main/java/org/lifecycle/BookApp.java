package org.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookApp {
    public static void main(String[] args) {
       AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.config.xml");
      /*   Book book = (Book) context.getBean("book1");
        System.out.println(book);
        context.registerShutdownHook();*/



        Library lib = (Library) context.getBean("lib1");
        System.out.println(lib);
        context.registerShutdownHook();

    }
}
