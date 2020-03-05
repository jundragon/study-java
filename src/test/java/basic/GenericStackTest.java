package basic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenericStackTest {
    private GenericStack<Integer> stackTest;

    @Before
    public void createStack() {
        stackTest = new GenericStack<>();
    }

    @Test
    public void stackMaipulations() {
        assertNull(stackTest.pop());

        for (int i = 0; i < 10; i++) {
            stackTest.push(i);
        }

        for (int i = 9; i >= 0; i--) {
            assertEquals(Integer.valueOf(i), stackTest.pop());
        }

        assertNull(stackTest.pop());
    }
}