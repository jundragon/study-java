package algorithm;

public class FizzBuzz {

    public static void main(String[] args) {
        printFizzBuzz(15);
        alternativeFizzBuzz(15);
    }

    public static void printFizzBuzz(final int n) {
        for (int i = 1; i <= n; i++) {
            String print = "";
            boolean isFizz = (i % 3 == 0);
            boolean isBuzz = (i % 5 == 0);
            if (!isFizz && !isBuzz) {
                System.out.println(i);
                continue;
            }

            if (isFizz) {
                print += "Fizz";
            }
            if (isBuzz) {
                print += "Buzz";
            }

            System.out.println(print);
        }
    }

    public static void alternativeFizzBuzz(final int n) {
        for (int i = 1; i <= n; i++) {
            final String word = toWord(3, i, "Fizz") + toWord(5, i, "Buzz");
            if (word.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(word);
            }
        }
    }

    private static String toWord(final int divisor,
                                 final int value,
                                 final String word) {
        return value % divisor == 0 ? word : "";
    }

}
