import data.Consumable;
import data.Wolf;

public class Practice {


    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        boolean isConsumable = wolf instanceof Consumable ? true : false;

        System.out.println("is consumable: " + isConsumable);
    }


}
