package org.example;

import java.util.*;

public class FindKSmallestElement {
    public static int kSmallestNumber(int[] arr,int k){
        Arrays.sort(arr);
        return arr[k-1];
    }

    public static void main(String[] args) {
        int q = kSmallestNumber(new int[]{130,23,567,34243,2,8},3);
        System.out.println(q);
    }
}
