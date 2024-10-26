package org.example;

import org.example.tdit.StudentInfo;
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
        ApplicationContext  context = new ClassPathXmlApplicationContext("tdit_config.xml");
        StudentInfo info = (StudentInfo) context.getBean("student1");
        System.out.println(info);

    }
}
