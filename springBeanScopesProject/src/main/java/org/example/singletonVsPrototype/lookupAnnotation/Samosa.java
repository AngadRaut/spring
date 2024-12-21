package org.example.singletonVsPrototype.lookupAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Samosa {
    @Autowired
    private Price price;

    public Samosa() {
    }

    @Lookup
    Price priceObject(){
        return null;
    }
    /*
    @Lookup
    Price priceObject(){
        return context.bean("price",Price.class);
    }*/
    public Samosa(Price price) {
        this.price = price;
    }

    public Price getPrice() {
        Price price1 = priceObject();
        return price1;
    }
    public void setPrice(Price price) {
        this.price = price;
    }
}
