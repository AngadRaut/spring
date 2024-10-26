package org.ref_injection;

public class Student {
    private int stu_id;
    private String stu_name;
    private Certificate certificate;

    public Student(){
        super();
    }
    public String toString(){
        return "{"+"Student id:"+stu_id+ ",name:"+stu_name+",Certificates"+certificate+" }\n";
    }
    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public Student(int stu_id, String stu_name, Certificate certificate) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.certificate = certificate;
    }
}
