package data;

public class Car {

    public Car() {

    }

    public Car(String make, String model, String registrationNo, String cin) {
        this.make = make;
        this.model = model;
        this.registrationNo = registrationNo;
        this.cin = cin;
    }

    private String make;
    private String model;
    private String registrationNo;
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

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", registrationNo='" + registrationNo + '\'' +
                ", cin='" + cin + '\'' +
                '}';
    }
}
