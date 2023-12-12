package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class MaxSumOfSubArray {
    static ArrayList<Integer> subarraysum(int[] arr, int s)
    {
        // Your code here
        int sum=0;
        int i=0,j=0;
        boolean flag = false;
        ArrayList<Integer> list = new ArrayList<>();
        while(j<arr.length){
            sum+=arr[j];
              while(sum>s){
                sum = sum-arr[i];
                i++;
            }
             if(sum == s){
                 list.add(i+1);
                 list.add(j+1);
                 return list;
             }
            j++;
        }


        return list;
    }
    public static void main(String[] args) {
        int[] a = {10000,5,1,6,4,3,4,3,4,3,3,9,3,4};
        ArrayList<Integer> s = subarraysum(a,22);
        System.out.println(subsum());
        System.out.println(s);
    }
    public static HashMap<Integer,Integer> subsum(){
        int[] a = {5,5,6,7,7};
        int sum=0,s=14;
       HashMap<Integer,Integer> integerHashMap= new HashMap<>();
             for(int i =0,j=0;i<a.length || j<a.length;i++){
                 sum+=a[i];
                 System.out.println("sum is "+sum);
                 if(!integerHashMap.containsKey(j)) {
                     integerHashMap.put(j,sum);
                     System.out.println(integerHashMap);

                 }
                 if(sum==s){
                     integerHashMap.put(i,sum);
                     break;
                 }
                 if(sum>s){
                     integerHashMap.remove(j);
                     sum = sum-a[j];
                     j++;
                 }
             }
        System.out.println(integerHashMap);
             return integerHashMap;
    }
}

