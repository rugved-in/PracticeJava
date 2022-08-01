package data;

public abstract class MotorBike extends Vehicle {

    private String make;
    private String model;

    public MotorBike() {
    }

    public MotorBike(String make, String model) {
        this.make = make;
        this.model = model;
    }

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

    public void ride() {
        move();
    }

    public void applyBreak() {
        System.out.println("applyBreak from MotorBike.");
    }
}
