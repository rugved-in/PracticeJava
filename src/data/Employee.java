package data;

public class Employee {


    public Employee(){

    }

    public Employee(int age, String name, float height, int weight, Car car, MotorBike motorBike) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.car = car;
        this.motorBike = motorBike;
    }

    /*a. Constructors - default, parametrized constructors
    b. getter and setter
    c. toString
    d. Overloading vs overriding*/

    private int age;
    private String name;
    private float height;
    private int weight;
    private Car car;

    private MotorBike motorBike;

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        }
    }

    public MotorBike getMotorBike() {
        return motorBike;
    }

    public void setMotorBike(MotorBike motorBike) {
        this.motorBike = motorBike;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", car=" + car +
                '}';
    }
}
