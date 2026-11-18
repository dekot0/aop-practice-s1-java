package homework.h13;
import java.util.ArrayDeque;
import java.util.Deque;

public class T2 {
        private Deque<Integer> in;
        private Deque<Integer> out;

        public T2() {
            in = new ArrayDeque<>();
            out = new ArrayDeque<>();
        }

        public void push(int x) {
            in.push(x);
        }

        public int pop() {
            move();
            return out.pop();
        }

        public int peek() {
            move();
            return out.peek();
        }

        public boolean empty() {
            return in.isEmpty() && out.isEmpty();
        }

        private void move() {
            if (out.isEmpty()) {
                while (!in.isEmpty()) {
                    out.push(in.pop());
                }
            }
        }
    }
