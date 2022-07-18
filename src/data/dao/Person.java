package data.dao;

public class Person {

    /*a. Constructors - default, parametrized constructors
    b. getter and setter
    c. toString
    d. Overloading vs overriding*/

    private int age;
    public String name;
    protected float height;
    int weight;


    public Person(int age, String name, float height, int weight) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
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

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "data.dao.Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
