package basic;

import java.util.List;

public class GenericVariance {

    static class A {

    }
    static class B extends A {

    }

    public static GenericStack<A> pushAllA(final List<? extends A> listOfA) {
        final GenericStack<A> stack = new GenericStack<>();
        for (A a : listOfA) {
            stack.push(a);
        }

        return stack;
    }


}
