package basic;

import java.util.LinkedList;
import java.util.List;

public class GenericStack<E> {
    private final List<E> values;

    public GenericStack() {
        values = new LinkedList<>();
    }

    public void push(final E object) {
        values.add(0, object);
    }

    public E pop() {
        if(values.size() <= 0) {
            return null;
        }

        return values.remove(0);
    }
}
