package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
class Thief{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
//        ArrayList<Integer> list1=new ArrayList<>();
//        ArrayList<Integer>list2=new ArrayList<>();
//        ArrayList<Integer>list3=new ArrayList<>();
//        for(int i=0;i<a.length;i++){
//            list1.add(a[i]);
//            if(i%2==0){
//                list2.add(a[i]);
//            }
//            else {
//                list3.add(a[i]);
//            }
//        }
//
//        list1.addAll(list2);
//        list1.addAll(list3);
//        System.out.println(list1);
        int n=a.length;
        int temp[]=new int[n*2];


        int k=0;
        for(int i=0;i<n;i++){
            temp[k++]=a[i];
        }
        for(int i=1;i<n;i+=2){
            temp[k++]=a[i];
        }
        for(int i=0;i<n;i+=2){
            temp[k++]=a[i];
        }
        System.out.println(Arrays.toString(temp));

    }
}