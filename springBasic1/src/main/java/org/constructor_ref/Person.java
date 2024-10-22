package org.constructor_ref;

import java.util.List;

public class Person {
    private int id;
    private String name;
    private List<String> childrens;
    private Certificate certificate;

    public Person(){
        super();
    }
    public Person(int id, String name, List<String> childrens, Certificate certificate) {
        this.id = id;
        this.name = name;
        this.childrens = childrens;
        this.certificate = certificate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "certificate=" + certificate +
                ", childrens=" + childrens +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}'+"\n";
    }
}
