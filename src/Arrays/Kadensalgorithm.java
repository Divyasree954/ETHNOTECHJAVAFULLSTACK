package Arrays;

public class Kadensalgorithm {
    public static void main(String[] args) {
        int []a={2,-5,1,7,-3,4,-6};
        int current=a[0];
        int sum=0;
        int max=a[0];
        for(int i=1;i<a.length;i++){
            current+=a[i];
            if(current>max){
                sum+=a[i];
            }
            if(current<0){

            }
        }
    }
}
