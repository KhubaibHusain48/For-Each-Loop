package Expressions;

public class ForEachLoop {
    public static void main(String[] args) {
//        forEachLoop();
        forEachLoop2();
    }

    public static void forEachLoop() {
        String[] names = new String[]
                {
                        "Khubaib", "Huzaifa", "Abdullah"
                };
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void forEachLoop2() {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int x : numbers)
            sum += x;
        System.out.println("Sum is: " + sum);
    }

}
