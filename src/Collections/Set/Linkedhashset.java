package Collections.Set;
import java.util.LinkedHashSet;
public class Linkedhashset {
    public static void main(String[] args) {
       LinkedHashSet<String> ls=new LinkedHashSet<>();
        ls.add("Divya");
        ls.add("Reganti");
        ls.add("Call");
        ls.add("Hello");
        ls.add("Sree");
        ls.add("Reganti");
        System.out.println(ls);
        ls.remove("Reganti");
        System.out.println(ls);
        System.out.println(ls.contains("Reganti"));

    }
}
