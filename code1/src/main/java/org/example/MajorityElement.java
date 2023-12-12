package org.example;

import java.util.*;

public class MajorityElement {

        public static int majorityElement(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i=0;i<nums.length;i++){
                if (map.containsKey(nums[i])){
                    int a =  map.get(nums[i]);
                    map.put(nums[i],++a);
                }

                else{
                    map.put(nums[i],1);
                }
            }
            for(Map.Entry<Integer,Integer> entry: map.entrySet()){
                System.out.println(entry.getKey()+"   "+entry.getValue());
                if(entry.getValue()> nums.length/2){
                    return entry.getKey();
                }
                }

            return -1;
        }


    public static void main(String[] args) {
        int a = majorityElement(new int[]{2,2,3,3,3,8,9,3,3,4});
        System.out.println(a);
    }
}
