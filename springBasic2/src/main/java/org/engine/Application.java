package org.engine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("vehicle.beans.xml");
        Vehicles v1 =(Vehicles) applicationContext.getBean(Vehicles.class);
        System.out.println(v1);
    }
}
