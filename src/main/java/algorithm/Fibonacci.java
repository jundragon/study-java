package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {

        // Arrays.stream(fibonacci(1)).forEach(e-> System.out.println(e)); // Error!!
        //Arrays.stream(fibonacci(10)).forEach(e-> System.out.println(e));

        //fibonacci2(10).stream().forEach(e-> System.out.println(e));
        System.out.println(fibonacci2(10).toString());

    }

    /**
     * 간단한 코드지만 n 이 2보다 크다는 가정을 두고 작성한 것이다.
     * 따라서, n이 2보다 작을 때는 오류가 발생
     */
    public static int[] fibonacci(int n) {

        int[] arr = new int[n];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
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
            return new ArrayList<>(); // 빈 리스트 반환
        }

        if (n == 1) {
            return Arrays.asList(1); // 1 이 들어있는 리스트 반환
        }

        if (n == 2) {
            return Arrays.asList(1, 1); // [1, 1] 이 들어있는 리스트 반환
        }

        final List<Integer> seq = new ArrayList<>(n);
        seq.add(1);
        seq.add(1);

        for (int i = 2; i < n; i++) {
            seq.add(seq.get(i-1) + seq.get(i-2));
        }
        return seq;
    }
}
