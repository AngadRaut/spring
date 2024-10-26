package org.constructor_ref;

public class Ambiguity {
    private int a;
    private int b;

    public Ambiguity(double a,double b){
        this.a =(int) a;
        this.b =(int) b;
        System.out.println("constructor : (double,double)");
    }
    public Ambiguity(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println("constructor : (int,int)");
    }
   /* public Ambiguity(String a,String b){
        this.a =Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("constructor : (String,String)");
    }*/
    public void add(){
        System.out.println("addition is = "+(this.a+this.b));
    }
}
