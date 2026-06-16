package Collections.Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class spotifyplaylist{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<String> q=new LinkedList<>();
        q.add("Nestama Nestamaa");
        q.offer("Nadhive");
        q.offer("vayyari");
        q.add("Ee Hrudayam");
        q.add("Gira Gira");
        q.offer("Andhamaa Andhamaa");
        q.offer("Adhentogani Vunnapatuga");
        q.offer("Chuttu Chutti");
        q.add("Sada nannu");
        q.offer("gelupu talapule");
        System.out.println(q);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String str=sc.next();
            q.offer(str);
        }
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.peek());

    }
}
