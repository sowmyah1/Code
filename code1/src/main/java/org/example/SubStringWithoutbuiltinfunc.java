package org.example;

public class SubStringWithoutbuiltinfunc {
    public static String hello(String s1,String sub){
        for(int i=0;i<s1.length()-sub.length();i++){
            boolean a = true;
            for(int j=0;j<sub.length();j++){
                if(s1.charAt(i+j)!=sub.charAt(j)){
                    a=false;
                    break;
                }
            }
            if(a){
                return "present";
            }
        }
        return "not present";
    }
    public static void main(String[] args) {
        String s = hello("anttwall","antsaw");
        System.out.println(s);
    }
}
