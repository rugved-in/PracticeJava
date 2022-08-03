import data.Car;
import data.Tigor;
import data.Wolf;

import java.util.ArrayList;
import java.util.List;

public class Practice {


    public static void main(String[] args) {

        Tigor rugvedsTigor = new Tigor("Tata", "XZ+", "3Cylinder", 2019);

        Tigor mukulsTigor = new Tigor("Tata", "XZ+", "3Cylinder", 2021);

        System.out.println(rugvedsTigor.equals(mukulsTigor));


    }


}
