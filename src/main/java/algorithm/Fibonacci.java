package algorithm;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {

        // Arrays.stream(fibonacci(1)).forEach(e-> System.out.println(e)); // Error!!
        //Arrays.stream(fibonacci(10)).forEach(e-> System.out.println(e));

        //fibonacci2(10).stream().forEach(e-> System.out.println(e));
        System.out.println(fibonacci2(10).toString());

        System.out.println(fibonacciN(10));

        System.out.println(fibonacciCache(10));

    }

    /**
     * 간단한 코드지만 n 이 2보다 크다는 가정을 두고 작성한 것이다.
     * 따라서, n이 2보다 작을 때는 오류가 발생
     */
    public static int[] fibonacci(int n) {

        int[] arr = new int[n];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr;
    }

    /**
     * 개선된 버전
     */
    public static List<Integer> fibonacci2(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must not be less than ZERO");
        }

        if (n == 0) {
            return Arrays.asList(0); // 0 이 들어있는 리스트 반환
        }

        if (n == 1) {
            return Arrays.asList(0, 1); // 1 이 들어있는 리스트 반환
        }

        final List<Integer> seq = new ArrayList<>(n);
        seq.add(0);
        seq.add(1);

        for (int i = 2; i <= n; i++) {
            seq.add(seq.get(i-1) + seq.get(i-2));
        }
        return seq;
    }

    /**
     * n 번째의 피보나치 수열 반환
     */
    public static int fibonacciN(final int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n은 1보다 작으면 안됩니다.");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int n1 = 0;
        int n2 = 1;
        int result = 1;

        for (int i = 2; i <= n; i++) {
            result = n1 + n2;
            n1 = n2;
            n2 = result;
        }

        return result;
    }

    /**
     * 피보나치 메모제이션
     */
    private static Map<Integer, Integer> fiboCache = new HashMap<>();
    public static int fibonacciCache(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n 이 0보다 작으면 안됩니다.");
        }

        fiboCache.put(0,0);
        fiboCache.put(1,1);

        return recuriveFiboN(n);
    }

    private static int recuriveFiboN(int n) {
        if (fiboCache.containsKey(n)) {
            return fiboCache.get(n);
        }

        int value = recuriveFiboN(n-1) + recuriveFiboN(n-2);
        fiboCache.put(n, value);
        return value;
    }
}
