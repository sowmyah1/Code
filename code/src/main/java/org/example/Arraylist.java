package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,-3,-2,7,-6,4));
//        ArrayList<Integer> subarr = new ArrayList<>();
//        int sum=0,count=-1,j=0;
//        for (Integer i : arr ){
//            sum += arr.get(j++);
//            if(count<sum) {
//                subarr.add(i);
//                count = sum;
//
//            }
//        }
//
//        System.out.println(subarr);
//        System.out.println(arr);

        int max=Integer.MIN_VALUE;
        int sum=0,s=0,start=s,end=0;
        for (int i=0;i< arr.size();i++) {
            sum+=arr.get(i);
            if(sum>max){
                max=sum;
                s=start;
                end=i;
            }
            if(sum<0)
            {
                sum=0;
                start=i;
            }
        }
        System.out.println(max);
        for(int i=start;i<=end;i++)
        {
            System.out.print(arr.get(i)+" ");
        }
    }
}