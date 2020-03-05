package designPattern;

import org.junit.Assert;
import org.junit.Test;

public class IntegerFlyweightTest {

    @Test
    public void sameIntegerInstances() {

        // -128 ~ 127 까지만 스태틱 메모리에 캐싱한다.
        // 그래서 두 인스턴스는 같다.
        final Integer a = Integer.valueOf(56);
        final Integer b = Integer.valueOf(56);

        Assert.assertSame(a, b);

        // -128 ~ 127 까지만 스태틱 메모리에 캐싱한다.
        // 그래서 두 인스턴스는 다르다.
        final Integer c = Integer.valueOf(472);
        final Integer d = Integer.valueOf(472);

        Assert.assertNotSame(c, d);
    }
}
