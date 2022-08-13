import java.util.Arrays;

public class TrianglePrint {

    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            if (i % 2 != 0) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
            }
        }
    }

}
