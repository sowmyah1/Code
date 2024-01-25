package org.example;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static int removeDupAddUnderScore(int[] nums){
//
//        Set<Integer> set = new HashSet<>();
//        int freq=0;
//        for (int i:nums){
//            if(set.contains(i)){
//                freq++;
//            }
//            set.add(i);
//        }
//        int j=0;
//        for (int i :set){
//            nums[j]=i;
//            System.out.println(nums[j]);
//            j++;
//
//        }
//
//        return freq;
        int temp=0;
        int i=0;
        for(int j=1;i<nums.length && j<nums.length;){
            if(nums[i] != nums[j]){
                temp= nums[i+1];
                nums[i+1] =nums[j];
                nums[j]= temp;
                System.out.println(nums[i]);
                i++;
            }
            j++;
        }
        for(int k=0;k<i+1;k++){
            System.out.println(nums[k]+" s");
        }
        return i+1;
    }
    public static String add(){
        String[] strs = new String[]{"flower","flow","flowing","flight"};
        String s,s1="";
        int size=Integer.MAX_VALUE;
        for( int i=0;i<strs.length;i++){
            if(size>strs[i].length()){
                size = strs[i].length();
            }
        }
        String c ="";
        for(int j=0;j+1< strs.length;j++){
            int k=0;
            while(k<size){
                if(strs[j].charAt(k)==strs[j+1].charAt(k)){
                    c= c+String.valueOf(strs[j].charAt(k));
                    k++;
                    System.out.println(c+" Im from if");
                }
                else{
                    break;
                }

            }
            c="";
            System.out.println(c+j);
        }
        return c;
    }
    public  static void addd(){

    }
    public  void asd(){
        addd();
    }
    public static void main(String[] args) {
//        int a=removeDupAddUnderScore(new int[]{1,1,2,3,3,4,4});
        System.out.println(add());

    }
}
