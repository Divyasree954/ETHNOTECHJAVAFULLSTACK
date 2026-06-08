import java.util.Arrays;
public class Twopointers{
    public static void main(String[]args){
        int []a={0,1,0,1,1,0,0,1};
        int front=0;
        int end=a.length-1;
        while(front<end){
            if(a[front]%2!=0 && a[end]%2==0){
                int temp=a[front];
                a[front]=a[end];
                a[end]=temp;
                front++;
                end--;
            }
            else if(a[front]%2==0){
                front++;
            }
            else{
                end--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}