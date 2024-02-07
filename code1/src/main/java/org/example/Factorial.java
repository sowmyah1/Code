package org.example;

public class Factorial {

    public static int climbStairs(int n) {
        int a;
        if(n<2){
            return 1;
        }
        else{
            System.out.println(n+" im before");
             a= (climbStairs(n-1)+climbStairs(n-2));
            System.out.println(n +" im after");
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }
}
