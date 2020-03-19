package algorithm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import static org.junit.Assert.*;

public class IteratorPracticeTest {

    @Test
    public void testIterator() {
        final Iterator<Integer> a = Arrays.asList(1, 2, 3, 4, 5).iterator();
        final Iterator<Integer> b = Arrays.asList(6, 7, 8, 9).iterator();

        final Iterator<Integer> singleIterator = IteratorPractice.singleIterator(Arrays.asList(a, b));

        assertTrue(singleIterator.hasNext());

        for (Integer i = 1; i <= 9; i++) {
            assertEquals(i, singleIterator.next());
        }
        assertFalse(singleIterator.hasNext());

    }

}