package org.example;

import java.util.Arrays;

public class PlusOneToArray {
    public static int[] plusOne(int[] a) {
        Arrays.sort(a);
        if (a[0] == 9 && a[a.length - 1] == 9) {
            int[] b = new int[a.length + 1];
            for (int i = a.length - 1; i >= 0; i--) {
                if (i == 0) {
                    b[i] = 1;
                } else {
                    b[i] = 0;
                }
            }
            return b;
        } else {
            for (int i = a.length-1; i >=0 ; i--) {
               if(a[i]>8){
                   a[i]=0;

               }
               else {
                   a[i]=a[i]+1;
               }
            }
            return a;
        }
    }
    public static void main(String[] args) {
int[] s = plusOne(new int[]{9,9,9,9});
for(int i=0;i<s.length;i++){
    System.out.println(s[i]);
}
    }
}
