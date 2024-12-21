package org.example.singleton;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*@Component
@Scope("singleton")*/

@Component("singletonDemo")
@Scope("singleton")
public class SingletonDemo {
    int age;

    public SingletonDemo() {
    }

    @Override
    public String toString() {
        return "SingletonDemo{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public SingletonDemo(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
}
