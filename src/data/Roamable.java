package data;

public interface Roamable {


    void roam();


    default void eat(){
        System.out.println("eat");
    }
}
