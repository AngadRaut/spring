package org.constructor_ref_injection;

public class Xyz {
    private String address;
    private int pinCode;

    public Xyz(){
        super();
    }
    public Xyz(String address, int pinCode) {
        this.address = address;
        this.pinCode = pinCode;
    }
    public String toString(){
        return "{ "+"address:"+address+",pin_code:"+pinCode+" }\n";
    }
}
