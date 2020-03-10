package sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MySortTest {

    @Test
    public void bubbleSort() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(new Integer[]{5, 2, 7, 1}));
        System.out.println("before: " + numbers);

        MySort.bubbleSortR(numbers);
        System.out.println("after : " + numbers);
    }

    @Test
    public void bubbleSortR() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(new Integer[]{5, 2, 7, 1}));
        System.out.println("before: " + numbers);

        MySort.bubbleSortR(numbers);
        System.out.println("after : " + numbers);
    }
}