package algorithm;

public class GuGudan {
    /**
     * 구구단을 재귀로 구현
     * @param n 단수
     * @param i
     */
    public static void printTable(int n, int i) {
        if (i <= 0) return;
        System.out.printf("%d * %d = %d \n", n, i, (n*i));
        printTable(n, i-1);
    }
}
