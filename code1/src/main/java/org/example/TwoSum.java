package org.example;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum( int[] nums){

            Map<Integer, Integer> numMap = new HashMap<>();
            int n = nums.length;
            int target=8;
            for (int i = 0; i < n; i++) {
                int complement = target - nums[i];
                if (numMap.containsKey(complement)) {
                    return new int[]{numMap.get(complement), i};
                }
                numMap.put(nums[i], i);
            }

            return new int[]{}; // No solution found

    }
    public static void main(String[] args) {
        int[] a = twoSum(new int[]{2, 2, 3, 6, 4, 5});
        for (int i : a) {
            System.out.println(i);
        }
    }
}
