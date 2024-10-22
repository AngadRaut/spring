package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Car c1 = (Car) applicationContext.getBean("car1");
        System.out.println(c1);
        Car c2 = (Car) applicationContext.getBean("car2");
        System.out.println(c2);
    }
}
