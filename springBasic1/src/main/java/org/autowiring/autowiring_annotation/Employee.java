package org.autowiring.autowiring_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

   private Address address;

    public Address getAddress() {
        return address;
    }

    @Autowired
//    @Qualifier("address2")
    public void setAddress(Address address) {
        System.out.println("setter injection");
        this.address = address;
    }
    public Employee(){
        super();
    }

    public String toString() {
        System.out.println("constructor injection");
        return "Employee{" +
                "address=" + address +
                '}';
    }

    public Employee(Address address) {
        this.address = address;
    }
}
