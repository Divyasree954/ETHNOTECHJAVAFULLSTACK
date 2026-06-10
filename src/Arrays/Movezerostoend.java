package Arrays;
import java.util.Arrays;
public class Movezerostoend {
    public static void main(String[] args) {
        int []a={4,5,0,1,9,0,5,0};
//        for(int i=0;i<a.length;i++){
//             if(a[i]!=0){
//                 System.out.println(a[i]+" ");
//             }
//        }
//        for(int i=0;i<a.length;i++){
//            if(a[i]==0){
//                System.out.println(a[i]+" ");
//            }
//        }
        int pos=0;
        for(int i=0;i<a.length;i++) {
            if (a[i] != 0) {
                int temp = a[pos];
                a[pos] = a[i];
                a[i] = temp;
                pos++;
            }
        }
        for (int i = 0; i <a.length; i++) {
            System.out.println(a[i]+" ");
        }
   }

}
