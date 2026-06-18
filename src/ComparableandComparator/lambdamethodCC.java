package ComparableandComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class lambdamethodCC {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(31);
        list.add(21);
        list.add(20);
        list.add(40);
        list.add(10);
        Comparator<Integer> com=(a, b)->a%10>b%10 ? 1 : -1;
        Collections.sort(list,com);
        System.out.println(list);
    }
}