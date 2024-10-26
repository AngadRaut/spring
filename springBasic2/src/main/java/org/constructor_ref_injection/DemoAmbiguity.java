package org.constructor_ref_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoAmbiguity {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor_injection.xml");
        Ambiguity ambiguity = (Ambiguity) context.getBean("ex1");
        ambiguity.sub();
    }
}
