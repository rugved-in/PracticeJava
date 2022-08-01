package data;

public abstract class Car extends Vehicle {

    public Car() {

    }

    public Car(String make, String model, String cin) {
        this.make = make;
        this.model = model;
        this.cin = cin;
    }

    public void drive() {
        move();
    }

    private String make;
    private String model;

    private String cin;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void applyBreak() {
        System.out.println("applyBreak from Car.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", cin='" + cin + '\'' +
                '}';
    }
}
