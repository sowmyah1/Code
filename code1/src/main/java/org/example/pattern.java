package org.example;

import java.util.ArrayList;
import java.util.List;

public class pattern {
    public static String pattern (String[] strs ,int n) {
//
//        for (int i = 0; i < a[0].length(); i++) {
//            char cc = a[i].charAt(i);
//            for (int j = 1; j < a.length; j++) {
//                if (i >= a[j].length() || a[j].charAt(i) != cc) {
//                    return a[i].substring(0, i);
//                }
//            }
//
//        }
//int i=0;
//        for ( i = 0; i < a[0].length(); i++) {
//            char currentChar = a[0].charAt(i);
//
//            // Check the current character against the same position in other strings
//            for (int j = 1; j < a.length; j++) {
//                // If we reach the end of any string or find a mismatch, return the prefix
//                if (i >= a[j].length() || a[j].charAt(i) != currentChar) {
//                    return a[0].substring(0, i);
//                }
//            }
//
//        }
//        if(i==a[0].length() ){
//            return String.valueOf(a[0].charAt(0));
//        }
//                return "-1";


//    static List<Integer> pattern(int N){
//        // code here
//        List<Integer> list = new ArrayList<>();
//        if(N<=0){
//            list.add(N);
//            return list;
//        }
//
//        int temp=N-5;
//        list.add(N);
//        list.add(temp);
//
//        while(temp>0){
//            temp=temp-5;
//            list.add(temp);
//            System.out.println("entered");
//        }
//
//        int i=0;
//        i=list.size()/2;
//        System.out.println(i);
//        return list;
//    }

            if (strs == null || strs.length == 0) {
                return "";
            }

            int minLength = Integer.MAX_VALUE;

            // Find the minimum length among all strings
            for (String str : strs) {
                minLength = Math.min(minLength, str.length());
            }

            // Iterate through characters up to the minimum length
            for (int i = 0; i < minLength; i++) {
                char currentChar = strs[0].charAt(i);

                // Check the current character against the same position in other strings
                for (int j = 1; j < strs.length; j++) {
                    if (strs[j].charAt(i) != currentChar) {
                        return strs[0].substring(0, i);
                    }
                }
            }

            // If we reach here, the entire prefix up to the minimum length is common
            return strs[0].substring(0, minLength);
        }


    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        String s = pattern(new String[]{"d","d","d"},3);
//        list1= pattern(4);
        System.out.println(s);
    }
}
