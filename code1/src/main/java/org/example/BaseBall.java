package org.example;

import java.util.Scanner;
import java.util.Stack;

public class BaseBall {
    public static int calPoints(String[] operations) {
        int sum = 0;
        int j = 0;
        int[] score = new int[operations.length];


        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case ("C"):
                    sum -= score[j - 1];
                    score[j - 1] = 0;
                    j--;
                    break;
                case ("D"):
                    score[j] = score[j - 1] * 2;
                    sum += score[j];
                    j++;
                    break;
                case ("+"):
                    score[j] = score[j - 1] + score[j - 2];
                    sum += score[j];
                    j++;
                    break;
                default:
                    score[j] = Integer.valueOf(operations[i]);
                    sum += score[j];
                    j++;
                    break;
            }


        }
        return sum;
    }

    public static void main(String[] args) {
        char[] a = {'a','s'};
        a[0] ='o';

        System.out.println("erfg");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        a= s.toCharArray();
        for(int i=0;i<4;i++){
            System.out.println(a[i]);
        }


//        System.out.println(calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
    }
}
