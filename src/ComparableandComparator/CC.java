package ComparableandComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class CC {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(31);
        list.add(21);
        list.add(20);
        list.add(40);
        list.add(10);
        Comparator<Integer>com=new Comparator<Integer>() {
            public int compare(Integer a, Integer b)
            {
                if(a%10>b%10){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };
        Collections.sort(list,com);
        System.out.println(list);

    }
}
