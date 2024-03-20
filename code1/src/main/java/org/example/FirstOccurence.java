package org.example;

public class FirstOccurence {
    public static int fo(){
        String needle = "leeto";
        String haystack ="leetcode";
        int i=0,j=0,m=j;
        while(i<needle.length()){
            if(haystack.charAt(j)==needle.charAt(i)) {

                System.out.println("haystack.charAt(j) -"+haystack.charAt(j)+" -needle.charAt(i)- "+needle.charAt(i));
                j++;
                i++;
                if (i == needle.length()) {
                    System.out.println(j+" "+( needle.length()-1-j )+"return");
                    return  needle.length()-1-j ;
                }
                System.out.println(" after i in needle "+i+" j in hay "+j);

            }
            else{
                j++;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int a= fo();
        System.out.println(a);
    }
}
