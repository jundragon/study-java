package basic.steam;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExam {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("김자바", 9)
        );

        double avg = list.stream()
                .mapToInt(Student::getScore)
                .average()
                .getAsDouble();

        System.out.println("평균 점수: " + avg);
    }

    private static class Student {
        private String name;
        private int score;

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }
}
