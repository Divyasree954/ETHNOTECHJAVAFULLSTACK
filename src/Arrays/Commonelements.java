import java.util.Arrays;
public class Commonelements{
    public static void main(String[]args){
        int[] arr2 = {1,2,3,4,5,6};
        int[] arr1 = {2,4,6,8,10};
        int[] arr3 = {2,3,6,9,12};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                for(int k=0;k<arr3.length;k++){
                    if(arr1[i]==arr2[j] && arr2[j]==arr3[k]){
                        System.out.println(arr1[i]);
                    }
                }
            }
        }
    }
}