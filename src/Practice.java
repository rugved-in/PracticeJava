import data.Car;
import data.Employee;

public class Practice {

    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.setAge(31);
        e1.setName("Rugved");
        e1.setHeight(5.7f);
        e1.setWeight(70);
        Car car = new Car();
        car.setCin("123456");
        car.setMake("Tata");
        car.setModel("Tigor");
        car.setRegistrationNo("MH31FE7274");
        e1.setCar(car);

        Employee e2 = new Employee();
        e2.setAge(31);
        e2.setName("Rugved");
        e2.setHeight(5.7f);
        e2.setWeight(70);
        Car car2 = new Car();
        car2.setCin("123456");
        car2.setMake("Tata");
        car2.setModel("Tigor");
        car2.setRegistrationNo("MH31FE7274");
        e2.setCar(car);
        System.out.println(e1);
        System.out.println(e2);

        if(e1.getName().equals(e2.getName())){
            System.out.println("objects are meaningfully same!");
        }else {
            System.out.println("objects are meaningfully not the same!");
        }

    }
    
}
