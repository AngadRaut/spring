package org.example.tdit;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;


@Getter
@ToString
@NoArgsConstructor
public class StudentInfo {
    private  String name;
    private String email_id;
    private Address address;
    private Certificates certificates;

   /* public StudentInfo(){
        super();
    }*/
    public void setName(String name) {
        System.out.println("setter injection");
        this.name = name;
    }

    public StudentInfo(String name, String email_id, Address address,Certificates certificates) {
        this.name = name;
        this.email_id = email_id;
        this.address = address;
        this.certificates = certificates;
        System.out.println("constructor injection");
    }

    @Autowired
    public void setCertificates(Certificates certificates) {
        this.certificates = certificates;
    }


    public void setEmail_id(String email_id) {

        this.email_id = email_id;
    }

    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }
}
