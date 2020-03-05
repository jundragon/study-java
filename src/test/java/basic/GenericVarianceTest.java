package basic;

import basic.GenericVariance.A;
import basic.GenericVariance.B;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static basic.GenericVariance.pushAllA;

public class GenericVarianceTest {

    @Test
    public void usePushAllA() {
        final ArrayList<A> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new A());
        }

        final GenericStack<A> genericStack = pushAllA(list);
        Assert.assertNotNull(genericStack.pop());
    }

    @Test
    public void usePushAllAWithBs() {
        final ArrayList<B> listOfBs = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            listOfBs.add(new B());
        }

        final GenericStack<A> genericStack = pushAllA(listOfBs);
        Assert.assertNotNull(genericStack);
    }

}