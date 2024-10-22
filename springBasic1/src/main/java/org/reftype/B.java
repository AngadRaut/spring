package org.reftype;

public class B {
    private  int id_b;

    @Override
    public String toString() {
        return "B{" +
                "id_b=" + id_b +
                ", name_b='" + name_b + '\'' +
                '}'+"\n";
    }

    public String getName_b() {
        return name_b;
    }

    public void setName_b(String name_b) {
        this.name_b = name_b;
    }
    public B(){
        super();
    }

    public B(int id_b, String name_b) {
        this.id_b = id_b;
        this.name_b = name_b;
    }

    public int getId_b() {
        return id_b;
    }

    public void setId_b(int id_b) {
        this.id_b = id_b;
    }

    private String name_b;

}
