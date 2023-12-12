package org.example;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveElement {
    public static int removeElement(int[] nums , int val){

        ArrayList<Integer> set = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                if(nums[i] != val) {
                    set.add(nums[i]);

                }
            }
        System.out.println(set);
            return set.size();

    }


    public static void main(String[] args) {
        int b = removeElement(new int[]{3,2,3,2},3);
        System.out.println(b);
    }
}
