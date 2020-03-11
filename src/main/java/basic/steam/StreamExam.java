package basic.steam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamExam {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "김자바");

        // Iterator 이용
        Iterator<String> iterator = list.iterator();
        System.out.println("Iterator 사용:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("==============================");

        // Stream 사용
        System.out.println("Stream 사용:");
        list.stream().forEach(n -> System.out.println(n));

    }
}
