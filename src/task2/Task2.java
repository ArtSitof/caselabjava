package task2;

public class Task2 {
    public static void main(String[] args) {
        int a = 11;
        int b = 22;
        System.out.println("The value of variables before the method works");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        swapIntegers(a, b);
    }

    public static void swapIntegers(int a, int b) {
        b += a;
        a = b - a;
        b = b - a;
        System.out.println("The value of the variables after the method has run");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
