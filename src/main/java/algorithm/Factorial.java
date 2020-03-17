package algorithm;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static int factorial(final int num) {
        int value = 1;

        for (int i = num; i > 0; i--) {
            value *= i;
        }
        return value;
    }
}
