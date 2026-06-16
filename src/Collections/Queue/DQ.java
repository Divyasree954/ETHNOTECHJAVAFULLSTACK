package Collections.Queue;
import java.util.ArrayDeque;
import java.util.Deque;
public class DQ {
        public static void main(String[] args) {
            Deque<Integer>dq = new ArrayDeque<>();
            dq.addFirst(10);
            dq.addFirst(20);
            dq.addLast(5);
            dq.addLast(3);
            dq.addLast(1);
            System.out.println(dq);
            dq.remove(3); //takes index o means
            System.out.println(dq);
            dq.pollFirst();
            dq.pollLast();
        }
}
