package data;

public class Employee {


    public Employee(){

    }

    public Employee(int age, String name, float height, int weight, Car car) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.car = car;
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
