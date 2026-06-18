package ComparableandComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class students {
    int rollno;
    String name;

    public students(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    void display(){
        System.out.println("Roll no: "+ rollno);
        System.out.println("Name: "+name);
    }
}
public class CCexample {
    public static void main(String[] args) {
        ArrayList<students> list=new ArrayList<students>();
        list.add(new students(10,"A"));
        list.add(new students(5,"B"));
        list.add(new students(2,"C"));
        list.add(new students(3,"D"));
        Comparator<students> com=new Comparator<students>() {
            public int compare(students a, students b) {
                   if(a.rollno>b.rollno){
                       return 1;
                   }
                   else{
                       return -1;
                   }
            }
        };
        Collections.sort(list,com);
        for (students s:list) {
            System.out.println(s.name + " " + s.rollno);
        }
    }
}
