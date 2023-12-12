package org.example;

public class MajorityElementOptimised {
    public static  int majorityElement (int[] nums){
        int count =0,cad=0;
        for (int i=0;i<nums.length;i++){
            if (count ==0){
             cad = nums[i];
            }
            count += (cad == nums[i])?  1:-1;

        }
        return cad;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,3,3,4,4,4,4,4}));
    }
}
