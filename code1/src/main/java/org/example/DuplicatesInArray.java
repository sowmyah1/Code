package org.example;

import java.util.*;

public class DuplicatesInArray {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new LinkedHashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
//        int freq;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
               set.add(arr[i]);

            } else {
                map.put(arr[i],1);
            }
        }
        for (Integer integer : set) {
            list.add(integer);
        }
        Collections.sort(list);
        if (list.size() == 0){
            list.add(-1);
            return list;
        }
        return list;
    }

    public static void main(String[] args) {
         int[] arr = {1,1,2,3,3};
         ArrayList<Integer> list1 = duplicates(arr,5);
//         for(int i=0;i<list1.size();i++){
             System.out.println(list1);
//         }
    }
}
