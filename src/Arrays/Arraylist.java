package Arrays;
import java.util.ArrayList;
class Arraylist{
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
 }
}