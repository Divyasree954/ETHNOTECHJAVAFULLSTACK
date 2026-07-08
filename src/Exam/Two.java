package Exam;

import java.util.*;
public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = 0;
        int right = 0;
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                left++;
            } else if (str.charAt(i) == '#') {
                right++;
            }
        }
        System.out.println(left-right);
    }

}
