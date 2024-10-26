package org.ref_injection;

public class Certificate {
    private String cert_name;
    private int cert_id;

    public Certificate(){
        super();
    }

    public String toString(){
        return "{ "+"certificate name :"+cert_name+" id:"+cert_id+" }\n";
    }

    public String getCert_name() {
        return cert_name;
    }

    public void setCert_name(String cert_name) {
        this.cert_name = cert_name;
    }

    public int getCert_id() {
        return cert_id;
    }

    public void setCert_id(int cert_id) {
        this.cert_id = cert_id;
    }

    public Certificate(String cert_name, int cert_id) {
        this.cert_name = cert_name;
        this.cert_id = cert_id;
    }
}
