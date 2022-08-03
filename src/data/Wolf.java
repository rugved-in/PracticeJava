package data;

public class Wolf extends Canine {

    @Override
    public void roam() {

    }

    @Override
    public void sleep() {
        System.out.println("Sleep from Wolf!");
        super.sleep();
    }
}
