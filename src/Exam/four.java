package Exam;

import java.util.*;
public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int l=sc.nextInt();
        int max=0;
        for (int i = 0; i < str.length(); i+=l) {
            int c=0;
            for(int j=i;j<i+l&&j<str.length();j++){
                if(str.charAt(i)=='a'){
                    c++;
                }
            }
            if(c>max){
                max=c;
            }
        }
        System.out.println(max);
    }

}
