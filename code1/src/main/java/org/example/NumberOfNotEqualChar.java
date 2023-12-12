package org.example;

import java.util.Arrays;
import java.util.TreeSet;

public class NumberOfNotEqualChar {
    public static int countOfNotEqualChar(String s1,String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        int i=0,j=0,count=0;

        while(i<s1.length() && j<s2.length()){
            if(c1[i]==c2[j]){
                i++;
                j++;
            }
            else if (c1[i]<c2[j]){
                count++;
                i++;
            }
            else{
                count++;
                j++;
            }
        }

        return count;
    }
public static int kthSmallest(int[] arr, int l, int r, int k)
{

      Arrays.sort(arr);
      return arr[k-1];

}
    public static void main(String[] args) {
         int a = kthSmallest(new int[]{7,10,4,3,20,15},0,5,3);
         int b = countOfNotEqualChar("qwerty","qwerty");
        System.out.println(b);
        System.out.println(a);
    }
}
