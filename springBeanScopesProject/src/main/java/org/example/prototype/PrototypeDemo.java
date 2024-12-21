package org.example.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("prototypeDemo")
@Scope("prototype")
public class PrototypeDemo {
    private String address;

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "PrototypeDemo{" +
                "address='" + address + '\'' +
                '}';
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PrototypeDemo() {
    }

    public PrototypeDemo(String address) {
        this.address = address;
    }
}
