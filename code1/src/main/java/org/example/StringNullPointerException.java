package org.example;

public class StringNullPointerException {
    public static void main(String[] args) {
        String q= "qwerty";
        String w = null;
        String s1 =q+w;
//
        System.out.println(w.charAt(0));//null pointer exception
    }
}
