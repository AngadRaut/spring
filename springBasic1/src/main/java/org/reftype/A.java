package org.reftype;

public class A {
    private int id;
    private String name;
    private B b;

    public int getId() {
        return id;
    }

    public A(){
        super();
    }
    @Override
    public String toString() {
        return "A{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", b=" + b +
                '}'+"\n";
    }

    public A(int id, String name, B b) {
        this.id = id;
        this.name = name;
        this.b = b;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
