package org.constructor_ref_injection;

import java.lang.reflect.AnnotatedArrayType;

public class Ambiguity {
    private int a;
    private int b;

    public Ambiguity(long a,long b){
        System.out.println("Ambiguity :(long,long)");
        this.a = (int) a;
        this.b = (int) b;
    }
    public Ambiguity(int a,int b){
        System.out.println("Ambiguity :(int,int)");
        this.a = a;
        this.b = b;
    }

   /* public Ambiguity(String a ,String b){
        System.out.println("Ambiguity :(String,String)");
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
    }*/

    public void sub(){
        System.out.println("sub is = "+(this.a-this.b));
    }
}
