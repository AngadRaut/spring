package org.example;

public class Car {
    private int car_id;
    private String car_name;
    private String engine_type;
    private  String model;
    private double car_price;

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "car_id=" + car_id +
                ", car_name='" + car_name + '\'' +
                ", engine_type='" + engine_type + '\'' +
                ", model='" + model + '\'' +
                ", car_price=" + car_price +
                '}'+"\n";
    }

    public Car(){
        super();
    }

    public Car(int car_id, String car_name, String engine_type, String model, double car_price) {
        this.car_id = car_id;
        this.car_name = car_name;
        this.engine_type = engine_type;
        this.model = model;
        this.car_price = car_price;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getEngine_type() {
        return engine_type;
    }

    public void setEngine_type(String engine_type) {
        this.engine_type = engine_type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCar_price() {
        return car_price;
    }

    public void setCar_price(double car_price) {
        this.car_price = car_price;
    }
}
