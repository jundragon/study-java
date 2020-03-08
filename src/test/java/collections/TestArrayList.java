package collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {
    @Test
    public void testArrayList() {
        ArrayList<Integer> list1 = new ArrayList<>(10);
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);
        ArrayList<Integer> list2 = new ArrayList<>(list1.subList(1, 4));

        System.out.println(list1);
        System.out.println(list2);

        Collections.sort(list1);
        System.out.println(list1);

        System.out.println(list1.containsAll(list2));
    }
}
