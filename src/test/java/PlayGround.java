import org.junit.Test;

import java.awt.print.Pageable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class PlayGround {

    @Test
    public void pg() {
        String s = "java.lang.Object";
        String c = s.substring(10);
        System.out.println(c);

        StringBuffer b = new StringBuffer("hoho");

        Map<String, Integer> map = new HashMap<>();
        map.put("ha", 2);
        map.put("ho", 3);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

    }

    public static boolean isNumber(String str) {

        if (str == null || str.isEmpty())
            return false;

        char[] arr = str.toCharArray();
        for (char ch : arr) {
            if (ch < '0' || ch > '9')
                return false;
        }

        return true;
    }

    @Test
    public void pg2() {
        System.out.println(isNumber("100"));
        System.out.println(isNumber("123"));
        System.out.println(isNumber("일이삼"));
        System.out.println(isNumber(null));

        long l = 100L;
        int i = 100;
        double d = 100.0;
        float f = 100.0f;

        String str = "22";
        StringBuffer buffer = new StringBuffer(str.length());

    }

    @Test
    public void pg3() {
        TestC testC = new TestC();

        String pattern = ".*11.*";
        Pattern p = Pattern.compile(pattern);
    }
}

abstract class TestP {

    // abstract int calc();

    TestP() {
        System.out.println("부모 생성자");
    }

    TestP(String string) {
        System.out.println("부모 생성자 스트링");
    }
}

class TestC extends TestP {
    TestC() {
        System.out.println("자식 생성자");
    }
}
