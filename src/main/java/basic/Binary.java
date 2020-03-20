package basic;

import java.util.Collections;
import java.util.List;

public class Binary {

    public static boolean binarySearch(final List<Integer> numbers, final Integer value) {
        if (numbers == null || numbers.isEmpty()) {
            return false;
        }

        final Integer comparison = numbers.get(numbers.size() / 2);
        if (value.equals(comparison)) {
            return true;
        }

        if (value < comparison) {
            return binarySearch(numbers.subList(0, numbers.size()/2), value);
        } else {
            return binarySearch(numbers.subList(numbers.size()/2 + 1, numbers.size()), value);
        }
    }
}
