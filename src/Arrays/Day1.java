package Arrays;

import java.util.Arrays;

public class Day1{
    public static void main(String[]args){
        int []a={1,2,3,4,5};
        for(int i=0;i<a.length-1;i++){
               a[i+1]=a[i];
        }
        System.out.println(Arrays.toString(a));
    }
}