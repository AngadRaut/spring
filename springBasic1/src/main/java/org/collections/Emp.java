package org.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
    private String name;
    private List<String> address;
    private Map<String,String> courses;
    private Set<String> phones;

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", courses=" + courses +
                ", phones=" + phones +
                '}'+"\n";
    }

    public Emp(){
        super();
    }
    public Emp(String name, List<String> address, Map<String, String> courses, Set<String> phones) {
        this.name = name;
        this.address = address;
        this.courses = courses;
        this.phones = phones;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Set<String> getPhones() {
        return phones;
    }

    public void setPhones(Set<String> phones) {
        this.phones = phones;
    }
}
