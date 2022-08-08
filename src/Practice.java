import data.Car;
import data.Tigor;
import data.Vehicle;

import java.util.*;

public class Practice {
    public static void main(String[] args) {

        Map<String,Tigor> tigorMap = new HashMap<>();
        Tigor t1 = new Tigor("Tata", "XZ+", "3Cylinder", 2019);
        t1.setCin("asdf12345asd");
        tigorMap.put(t1.getCin(),t1);

        Tigor t2 = new Tigor("Tata", "XZ+", "3Cylinder", 2021);
        t2.setCin("asdf12346asd");
        tigorMap.put(t2.getCin(),t2);

        System.out.println(tigorMap.get("aasdsad123"));
    }

    static List<Tigor> getCars() throws ArrayIndexOutOfBoundsException {
        List<Tigor> tigorList = new ArrayList<>();

        Tigor t1 = new Tigor("Tata", "XZ+", "3Cylinder", 2019);
        tigorList.add(t1);
        Tigor t2 = new Tigor("Tata", "XZ+", "3Cylinder", 2021);
        tigorList.add(t2);
        Tigor t3 = new Tigor("Tata", "XZ+", "3Cylinder", 2022);
        tigorList.add(t3);
        Tigor t4 = new Tigor("Tata", "XZ+", "3Cylinder", 2019);
        tigorList.add(t4);
        Tigor t5 = new Tigor("Tata", "XZ+", "3Cylinder", 2018);
        tigorList.add(t5);
        Tigor t6 = new Tigor("Tata", "XZ+", "3Cylinder", 2020);
        tigorList.add(t6);

        return tigorList;
    }
}
