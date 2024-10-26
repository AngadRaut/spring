package org.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Library {

    private String name;

    public Library(String name, String location) {
        this.name = name;
        this.location = location;
    }
    public Library(){
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String location;

    @PostConstruct
    public void init (){
        System.out.println("this is init method");
    }
    @PreDestroy
    public void destroy (){
        System.out.println("this is destroy method");
    }

}
