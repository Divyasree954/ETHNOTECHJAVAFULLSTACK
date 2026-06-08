package Collections.List;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(10);
        list.add("Dear Comrade");
        list.add("Dacoit");
        list.add("Em Maya Chesavey");
        list.add("Mahanati");
        list.add("Seetharamam");
        list.add("Anand");
        list.add("Godavari");
        list.add("8 Vasanthalu");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove(3);
        System.out.println(list);
        list.set(3, "With Love");
        System.out.println(list);
        System.out.println(list.contains("Anand"));
    }

    }
