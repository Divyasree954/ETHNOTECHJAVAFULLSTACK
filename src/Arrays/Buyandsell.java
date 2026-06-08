package Arrays;

class Buyandsell {
    public static void main(String[] args) {
        int a[] = {4,2};
        int sum = a[0];
        int p = 0;
        int i = 1;
          for (i = 1; i < a.length; i++) {
            if (a[i]<sum) {
                p += a[i-1] - sum;

                if (i != a.length - 1) {
                    sum = a[i];
                }
            }
        }
            if (i == a.length) {
                p += a[i-1] - sum;
            }
        System.out.println(p);

    }
}
//        for (int i = 1; i < a.length; i++) {
//            if(a[i]>=sum){
//                p+=a[i]-sum;
//            }
//            if(i!=a.length){
//                sum=a[i];
//            }
//            if(i==a.length){
//                a[i-1]=sum;
//            }
//        }
//        System.out.println(p);
//    }
//
//
//}