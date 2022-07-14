public class Practice {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1);
        System.out.println(p2);
        int[] numbers = {1, 2, 3, 4};
        p1.assignValues(32, "Rugved", 5.7f, numbers);
        System.out.println("Age: " + p1.age);
        System.out.println("Name: " + p1.name);
        System.out.println("Height: " + p1.height);
        for (int num: p1.nums) {
            System.out.println("Num: " + num);
        }

        String s1 = new String("Rugved");
        String s2 = "Rugved";
        System.out.println(s1);
        System.out.println(s2);
    }
}
