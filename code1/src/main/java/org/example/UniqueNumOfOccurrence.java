package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueNumOfOccurrence {
    public static Boolean occurrence(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i :arr){
//            map.put(i, map.getOrDefault(map.get(i),0)+1);
            if(map.containsKey(i)){
                int q= map.get(i);
                map.put(i,q+1);
            }
            else{
                map.put(i,1);
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i : map.values()){
            if( !set.add(i)){
                return false;
            }
        }
       return true;
    }
    public static void main(String[] args) {
//     Boolean alpha = occurrence(new int[]{1,1,1,2,2,2});
//        System.out.println(alpha);
        String s = "qw";
        s=s+"er";
        s=s+"ty";
        System.out.println(s);
    }
}
