package Collections.Queue;
import java.util.LinkedList;
import java.util.Queue;
public class queue {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.offer(2);
        q.offer(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.remove());
        System.out.println(q);
        q.clear();
        System.out.println(q.poll());
        q.offer(6);
        q.offer(7);
        System.out.println(q.contains(5));
        System.out.println(q.contains(7));
        System.out.println(q.peek());
    }
}
