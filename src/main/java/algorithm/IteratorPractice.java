package algorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.iterator();
    }

    public static <T> Iterator<T> singleIterator(final List<Iterator<T>> iteratorList) {
        return new ListIterator<>(iteratorList);
    }

    public static class ListIterator<T> implements Iterator<T> {

        private final Iterator<Iterator<T>> listIterator;
        private Iterator<T> currentIterator;

        public ListIterator(List<Iterator<T>> iterators) {
            this.listIterator = iterators.iterator();
            this.currentIterator = listIterator.next();
        }

        @Override
        public boolean hasNext() {
            if (!currentIterator.hasNext()) {
                if (!listIterator.hasNext()) {
                    return false;
                }

                currentIterator = listIterator.next();
                hasNext();
            }
            return true;
        }

        @Override
        public T next() {
            hasNext();
            return currentIterator.next();
        }

        @Override
        public void remove() {
            hasNext();
            currentIterator.remove();
        }
    }
}
