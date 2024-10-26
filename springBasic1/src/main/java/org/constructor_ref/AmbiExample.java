package org.constructor_ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AmbiExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.constructor.xml");
        Ambiguity a = (Ambiguity) context.getBean(Ambiguity.class);
        a.add();
    }
}
