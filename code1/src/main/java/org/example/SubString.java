package org.example;

public class SubString {
    public static boolean betterString(String qwerty,String ans){

        return qwerty.matches("(.*)"+ans+"(.*)");
    }
    public static boolean stringmatch2(String qwerty,String ans){

        return qwerty.contains(ans);
    }

    public static void main(String[] args) {
        System.out.println( betterString("hemathantt","ant"));
        System.out.println(stringmatch2("qwerty","  "));
    }
}
