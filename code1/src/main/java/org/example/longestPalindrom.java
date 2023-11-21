package org.example;

import java.util.HashMap;
import java.util.Map;

public class longestPalindrom {
    public  static int palindrome(String s){
        HashMap<Character,Integer> seq = new HashMap<>();
        int i=0,count1=0;
        while(i<s.length()){
            if(seq.containsKey(s.charAt(i))){
                count1++;
                seq.remove(s.charAt(i));
//                int c = seq.get(s.charAt(i));
//                seq.put(s.charAt(i),c+1);
            }
            else{
                seq.put(s.charAt(i),1);
            }
            i++;
        }
        if(seq.size()==0){
            return count1*2;
        }
        return (count1*2)+1;
//        int count=0;
//        boolean b=false;
//        for(Map.Entry<Character,Integer> entry : seq.entrySet()){
//
//            if(entry.getValue()%2==0){
//                count = count+ entry.getValue();
//            }
//            else{
//                b=true;
//            }
//        }
//        if(b){
//            count++;
//         }
//
//        return count;
    }
    public static void main(String[] args) {
        System.out.println("1");
     int map = palindrome("ccc");
        System.out.println(map);
//        int count=0;
//        boolean b=false;
//      for(Map.Entry<Character,Integer> entry : map.entrySet()){
//          if(entry.getValue()%2==0){
//              count = count+ entry.getValue();
//          }
//          else{
//              b=true;
//          }
//      }
//      if(b){
//          count++;
//      }
//        System.out.println(count);
    }
}
