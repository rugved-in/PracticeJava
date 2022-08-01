package data;

public abstract class Vehicle implements Roamable {

    public boolean isPassenger;
    private String registrationNo;

    public boolean isPassenger() {
        return isPassenger;
    }

    public void setPassenger(boolean passenger) {
        isPassenger = passenger;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public void move() {

    }

    public void applyBreak() {
        System.out.println("applyBreak from Vehicle.");
    }
}
