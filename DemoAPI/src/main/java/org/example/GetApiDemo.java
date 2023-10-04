package org.example;

public class GetApiDemo {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int[] a = {32,-32,9,7,-2};
        int[] b = {-32,-46,0,1,-2};
        int j=0,count=0;
        for(int i=0;i<5;i++){
            if(a[j]==b[i])
            {
                count++;
            }

            if(i==4)
            {
                j++;i=0;
            }

        }
        if(count ==4)
            System.out.println("match");
        else
            System.out.println("no");

    }

}