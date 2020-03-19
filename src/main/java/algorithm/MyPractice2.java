package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyPractice2 {

    public static void main(String[] args) {
        final List<Integer> list = Arrays.asList(1, 2, 3);
        List<Integer> list1 = addOne(list);
        AddOneOperation add = new AddOneOperation();
        List<Integer> list2 = updateList(list, add);

        System.out.println(list2);

    }

    public static List<Integer> addOne(final List<Integer> numbers) {
        final ArrayList<Integer> toReturn = new ArrayList<>(numbers.size());

        for (final Integer number : numbers) {
            toReturn.add(number+1);
        }

        return toReturn;
    }

    public static List<Integer> updateList(final List<Integer> numbers, IntegerOperation op) {
        final ArrayList<Integer> toReturn = new ArrayList<>(numbers.size());

        numbers.stream().forEach(number->toReturn.add(op.performOperation(number)));
        return toReturn;
    }
}

interface IntegerOperation {
    Integer performOperation(Integer value);
}

class AddOneOperation implements IntegerOperation {
    @Override
    public Integer performOperation(Integer value) {
        return value + 1;
    }
}