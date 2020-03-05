package designPattern.template;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class Stack {

    private final LinkedList<Integer> stack;

    public Stack() {
        this.stack = new LinkedList<>();
    }

    public Stack(final LinkedList<Integer> initialState) {
        this.stack = initialState;
    }

    public void push(final int number) {
        stack.add(0, number);
    }

    public Integer pop() {
        return stack.remove(0);
    }

    public Stack filter(final StackPredicate filter ){
        final LinkedList<Integer> initialState = new LinkedList<>();
        for (Integer integer : stack) {
            if (filter.isValid(integer)) {
                initialState.add(integer);
            }
        }
        return new Stack(initialState);
    }
}
