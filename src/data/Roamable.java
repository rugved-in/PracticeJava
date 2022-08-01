package data;

public interface Roamable extends Consumable {


    void roam();


    default void eat(){
        System.out.println("eat");
    }
}
