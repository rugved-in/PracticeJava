import data.Car;
import data.Employee;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {

    public static void main(String[] args) {

        /**
         * Example 1 of creating and initializing objects
         */
//        Employee e1 = new Employee();
//        e1.setAge(31);
//        e1.setName("Rugved");
//        e1.setHeight(5.7f);
//        e1.setWeight(70);
//        Car car1 = new Car();
//        car1.setCin("123456");
//        car1.setMake("Tata");
//        car1.setModel("Tigor");
//        car1.setRegistrationNo("MH31FE7274");
//        e1.setCar(car1);
        /**
         * Example 2 of creating and initializing objects
         */
//        Car car = new Car("Tata", "Tigot", "asads", "asdads");
//        Employee employee = new Employee(31, "Rugved", 5.7f, 70, car);
//        System.out.println(employee);

        /************* Java streams *********/
        /**
         * Example 1 with range
         */
        System.out.println("Example 1 with range");
        IntStream.range(1, 10).forEach(System.out::print);
        System.out.println();// blank line

        /**
         * Example 2 with skip
         */
        System.out.println("Example 2 with skip");
        IntStream.range(1, 10).skip(5).forEach(x -> System.out.println(x));

        /**
         * Example 3 with sum
         */
        System.out.println("Example 3 with sum");
        System.out.println(IntStream.range(1, 5).sum());

        /**
         * Example 4 Stream.of , sorted, findFirst
         */
        System.out.println("Example 4 Stream.of , sorted, findFirst");
        Stream.of("Ankit", "Rugved", "Roshan", "Sachin", "Bhushan", "Aaditya")
                .sorted()
                .findFirst()
                .ifPresent(s -> System.out.println(s));

        /**
         * Example 5 Stream from array , sort, filter and print
         */
        System.out.println("Example 5 Stream from array , sort, filter and print");
        String[] names = {"Ankit", "Rugved", "Roshan", "Rugved", "Sachin", "Suraj", "Bhushan"};
        Arrays.stream(names) // same as Stream.of
                .filter(x -> x.startsWith("R"))
                .sorted()
                .forEach(s -> System.out.println(s));

        /**
         * Example 6 average of squares in an int array.
         */
        System.out.println("Example 6 average of squares in an int array.");
        Arrays.stream(new int[]{2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);


    }
}
