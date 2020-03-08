package collections;

import org.junit.Test;
import sun.awt.image.ImageWatched;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestStackQueue {
    @Test
    public void testStackQueue() {
        Stack st = new Stack();
        Queue q = new LinkedList();

        for (int i = 0; i < 3; i++) {
           st.push(String.valueOf(i));
           q.offer(String.valueOf(i));
        }

        System.out.println("stack: ");
        while (!st.empty()) {
            System.out.println(st.pop());
        }

        System.out.println("queue: ");
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }

    }

    @Test
    public void checkBracket() {

        Stack st = new Stack();
        String expression = "((2+3)*1)+3";
        System.out.println("expression: " + expression);

        try {
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);

                if (ch == '(') {
                    st.push(ch);
                } else if (ch == ')') {
                    st.pop();
                }
            }

            if (st.empty()) {
                System.out.println("괄호 체크 통과");
            } else {
                System.out.println("잘못된 괄호입니다.");
            }
        } catch (EmptyStackException e) {
            System.out.println("잘못된 괄호입니다.");
        } // try
    }
}
