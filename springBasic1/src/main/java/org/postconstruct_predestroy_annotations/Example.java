package org.postconstruct_predestroy_annotations;

public class Example {
    private String subject;

    public Example(){
        super();
    }

    public Example(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    public void init(){
        System.out.println("init method");
    }
    public void destroy(){
        System.out.println("destroy method");
    }
}
