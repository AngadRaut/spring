package org.engine;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Vehicles {
    private String brand_name;
    private Set<String> vehicle_types;
    private Map<String,String> engine_type_capacity;

    public Vehicles(){
        super();
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "brand_name=" + brand_name +
                ", vehicle_types=" + vehicle_types +
                ", engine_type_capacity=" + engine_type_capacity +
                '}'+"\n";
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        System.out.println("Setter Injection used");
        this.brand_name = brand_name;
    }

    public Set<String> getVehicle_types() {
        return vehicle_types;
    }

    public void setVehicle_types(Set<String> vehicle_types) {
        this.vehicle_types = vehicle_types;
    }

    public Map<String, String> getEngine_type_capacity() {
        return engine_type_capacity;
    }

    public void setEngine_type_capacity(Map<String, String> engine_type_capacity) {
        this.engine_type_capacity = engine_type_capacity;
    }

    public Vehicles(String brand_name, Set<String> vehicle_types, Map<String, String> engine_type_capacity) {
        this.brand_name = brand_name;
        this.vehicle_types = vehicle_types;
        this.engine_type_capacity = engine_type_capacity;
    }
}
