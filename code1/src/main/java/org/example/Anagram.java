package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Anagram {
    public static boolean isAnagram(String a,String b)
    {

        // Your code here
        Set<Character> map = new LinkedHashSet<>();
        Set<Character> set = new LinkedHashSet<>();
        if(a.length() ==0 || b.length()==0 || a.length() != b.length()){
            return false;
        }
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(b1);
        for(int i=0;i<a1.length;i++){
            System.out.print(a1[i]);
        }
        System.out.println();
        for(int i=0;i<a1.length;i++){
            System.out.print(b1[i]);
        }

        return !b1.equals(a1);
//        for(int i=0;i<a.length();i++){
//            set.add(a.charAt(i));
//            map.add(b.charAt(i));
//        }
//        if(map.size() != set.size()){
//            return false;
//        }
//
//        HashMap<Character,Integer> map1 = new HashMap<>();
//        HashMap<Object, Object> map2 = new HashMap<>();
//        for(int i=0;i<a.length();i++){
//            map1.put(a.charAt(i),1);
//            System.out.println("the key is  of first string"+map1.get(a.charAt(i)) +" "+ a.charAt(i));
//            map2.put(b.charAt(i),1);
//            System.out.println("the key is second string "+map2.get(a.charAt(i))+" "+b.charAt(i));
//        }
//        return map1.equals(map2);

//        System.out.println("the eqality"+map1.equals(map2));
//        return set.equals(map);
//        for(int i=0;i<b.length();i++){
//            if(!map.contains(b.charAt(i))){
//                return false;
//            }
//        }
//        return true;
    }

    public static void main(String[] args) {
       boolean b= isAnagram("geekforgeeks","forgeekgeeks");
        System.out.println(b);
    }
}
