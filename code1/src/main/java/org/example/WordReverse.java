package org.example;

public class WordReverse {
    public static void rev(String s){
        int k=0;
        for (int i=0,j=1;i<s.length() && j<s.length();){
            if(s.charAt(j) == ' ' || j==s.length()-1){
                k=j;
                while(k >=i) {
                    System.out.println(s.charAt(k));
                    k--;
                }
                System.out.println(" ");
                i=j+1;
                j++;

            } else{
                j++;
            }
        }

    }
    public static void main(String[] args) {
        rev("hi hello welcome");
    }
}
