package Arrays;

public class maximumsumsubarray {
    public static void main(String[] args) {
        int []a={2,-5,1,7,-3,4,-6};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
                sum+=a[j];
                if(sum>max){
                    max=sum;
                }
            }
        }
        System.out.println(max);
    }
}
