package Collections.Set;
import java.util.HashSet;
public class hashset {
    public static void main(String[] args) {
        HashSet<String>hs=new HashSet<>();
        hs.add("Divya");
        hs.add("Reganti");
        hs.add("Call");
        hs.add("Hello");
        hs.add("Sree");
        hs.add("Reganti");
        System.out.println(hs);
        hs.remove("Reganti");
        System.out.println(hs);
        System.out.println(hs.contains("Reganti"));

    }
}
