package org.autowiring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowired.emp.xml");
        Employee address = (Employee) context.getBean("emp1");
        System.out.println(address);
    }
}
