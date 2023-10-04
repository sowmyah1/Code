package org.example;

import java.util.HashSet;
import java.util.LinkedList;


public class Starprint {
    public static void main(String[] args) {
//        int n=4,h=1;
//        for(int i=4;i!=0;i--) {
////            System.out.println(" ");
//            int j;
//            for (j = i - 1; j >= 0; j--) {
//                System.out.print(" ");
//            }
//            int k;
//            for (k = 1; k<=h && h!=5;k++ ){
//                System.out.print(" " + " * ");
//            }
//            h++;
//            System.out.println(" ");
//        }

//        LinkedList<Integer> objects = new LinkedList<>();
//        objects.add(1);
//        objects.add(2);
//        objects.set(1,2);


//        HashSet<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(2);
//        set.remove(2);
//
//        if(set.contains(2)){
//            System.out.println("yes" + " "+set);
//        }
//        set.clear();
//        System.out.println(set);

//        String s = "abcabcbb";
//
//        HashSet<Character> set = new HashSet<>();
//        int i=0,max =0;
//        for(int j=0;j<s.length();j++){
//            if(!set.contains(s.charAt(j))){
//                set.add(s.charAt(j));
//                max=set.size();
//            }
//            else{
//                set.clear();
//                j=i++;
//            }
//        }
//        System.out.println(max);

        int n= 123,a,p=10;
        for(int i=0;n!=0;i++){
            a=n%p;
            if(n%a==0) {
                System.out.println(a);
                a=0;
            }
            p=p*10;
        }
    }
}
