package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MySort {

    public static void main(String[] args) {
        List<Integer> sampleList = Arrays.asList(3, 2, 5, 1, 6);

        System.out.println(quickSort(sampleList));

        System.out.println(mergeSort(sampleList));
    }

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
        if (numbers.size() < 2) return numbers;

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

    /**
     * 퀵소트
     * @param numbers
     * @return
     */
    public static List<Integer> quickSort(List<Integer> numbers) {
        if (numbers.size() <= 1) return numbers;

        final Integer pivot = numbers.get(0);
        final List<Integer> left = new ArrayList<>();
        final List<Integer> right = new ArrayList<>();

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < pivot) {
                left.add(numbers.get(i));
            } else {
                right.add(numbers.get(i));
            }
        }

        final List<Integer> sorted = quickSort(left);
        sorted.add(pivot);
        sorted.addAll(quickSort(right));
        return sorted;
    }

    public static List<Integer> mergeSort(List<Integer> numbers) {
        if (numbers.size() < 2) {
            return numbers;
        }

        List<Integer> left = numbers.subList(0, numbers.size()/2);
        List<Integer> right = numbers.subList(numbers.size()/2, numbers.size());

        return merge(mergeSort(left), mergeSort(right));
    }

    public static List<Integer> merge(final List<Integer> left, final List<Integer> right) {
        final List<Integer> merged = new ArrayList<>(left.size() + right.size());

        int leftIdx = 0;
        int rightIdx = 0;

        while (leftIdx < left.size() && rightIdx < right.size()) {
            Integer leftNum = left.get(leftIdx);
            Integer rightNum = right.get(rightIdx);
            if (leftNum < rightNum) {
                merged.add(leftNum);
                leftIdx++;
            } else {
                merged.add(rightNum);
                rightIdx++;
            }
        }

        // left 남았다면 처리
        if (leftIdx < left.size()) {
            while (leftIdx < left.size()) {
                merged.add(left.get(leftIdx));
                leftIdx++;
            }
        }

        // right 남았다면 처리
        if (rightIdx < right.size()) {
            while (rightIdx < right.size()) {
                merged.add(right.get(rightIdx));
                rightIdx++;
            }
        }

        return merged;
    }
}
