package org.example;

import java.util.Stack;
import java.util.Timer;

public class PricesUsingStack {
    public static int[] finalPrices(int[] A) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            while (!stack.isEmpty() && A[stack.peek()] >= A[i]) {
                A[stack.pop()] -= A[i];
            }
            stack.push(i);
        }
        return A;
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        int[] a = finalPrices(new int[]{8,4,6,7,3});
        for (int q: a){
            System.out.println(q);
        }
    }
}
