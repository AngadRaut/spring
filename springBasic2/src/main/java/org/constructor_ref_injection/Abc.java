package org.constructor_ref_injection;

public class Abc {
    private String name;
    private String sirName;
    private Xyz xyz;

    public Abc(){
        super();
    }
    public Abc(String name,String sirName,Xyz xyz){
        this.name = name;
        this.sirName = sirName;
        this.xyz = xyz;
    }
    public String toString(){
        return "{ "+"Name:"+name+",SirName:"+sirName+","+xyz+" }\n";
    }
}
