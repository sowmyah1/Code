package org.example;

import java.util.HashMap;

public class FancyString {
    public static void fancyString(){
        String s = "aaa";
        StringBuilder str = new StringBuilder();
        int i=0,j=i+1,k=i+2;
        while(k<s.length()){
            if(s.charAt(i)==s.charAt(j)&&s.charAt(i)==s.charAt(k)){
                str= str.append(s.charAt(j));
                str= str.append(s.charAt(k));
                i=k+1;j=i+1;k=i+2;
            }
            else{
                str.append(s.charAt(i));
                i++;
                j++;k++;
            }
        }
        if(i<=s.length()-2)
        {
            str.append(s.charAt(s.length() - 2));
            str.append(s.charAt(s.length() - 1));
        }
        System.out.println(str);
    }


    public static void main(String[] args) {
        fancyString();
    }
}
