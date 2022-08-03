package data;

abstract public class Animal implements Roamable {

    public String image;
    public String food;
    public String habitat;
    public String hunger;

    public void makeNoise() {

    }

    public void eat() {

    }

    public void sleep() {
        System.out.println("Sleep from Animal!");
    }
}
