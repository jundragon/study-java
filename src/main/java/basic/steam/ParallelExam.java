package basic.steam;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ParallelExam {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "김자바", "람다식", "박병렬");

        // 순차처리
        list.stream().forEach(ParallelExam::print);

        System.out.println("======================");

        // 병렬처리
        list.parallelStream().forEach(ParallelExam::print);
    }

    private static void print(String name) {
        System.out.println(name + ":" + Thread.currentThread().getName());
    }
}
