import data.Car;
import data.Tigor;
import data.Vehicle;

import java.util.*;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Some work started! Thread:" + Thread.currentThread().getName());
        /*Thread myThread = new MyThread("Thread-01");
        myThread.start();
        Thread.sleep(1000 * 2);*/
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable, "MyRunnable-01");
        thread.start();
        thread.join();
        for (int i = 0; i < 300; i++) {
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" " + i + "on Thread: " + Thread.currentThread().getName());
        }

        System.out.println("Some work ended! Thread:" + Thread.currentThread().getName());
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
