package org.example;

public class HelloWorldSeries {
    public static void main(String[] args) {
        String s = "helloworld";
        char a=(int)97;
        char z =(int) 122;
        for(int i=1;i<26;i++){
            for(int j=0;j<i-1;j++){
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }

    }
}
