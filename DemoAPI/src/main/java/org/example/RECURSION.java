package org.example;
import java.util.*;
public class RECURSION{
    String name ="Rakshitha";
    int fname = 3;

    public String getName(){
        return name +"\n"+fname;
    }

    public  static  String reverse(String s)
    {
        if (s.length()==0){
            return s;
        }
        return  reverse(s.substring(1))+s.charAt(0);
    }
    public static void main(String[] args) {
//        System.out.println(reverse("hema"));
        RECURSION obj = new RECURSION();

        System.out.println(obj.getName());
    }

}
