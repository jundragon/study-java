package sort;

import java.util.List;

public class MySort {

    /**
     * 버블 정렬
     * @param numbers
     */
    public static void bubbleSort(List<Integer> numbers) {
        if (numbers.size() == 0) {
            return;
        }

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size() - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j+1)) {
                    swap(numbers, j, j+1);
                }
            }
        }
    }

    /**
     * 재귀 버블 정렬
     * @param numbers
     * @return
     */
    public static List<Integer> bubbleSortR(List<Integer> numbers) {
        if (numbers.size() <= 1) return numbers;

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) > numbers.get(i+1)) {
                swap(numbers, i, i+1);
            }
        }
        bubbleSortR(numbers.subList(0, numbers.size() - 1));
        return numbers;
    }

    private static void swap(List<Integer> numbers, int j, int i) {
        Integer temp = numbers.get(j);
        numbers.set(j, numbers.get(j+1));
        numbers.set(j+1, temp);
    }
}
