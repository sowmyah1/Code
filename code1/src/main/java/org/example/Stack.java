package org.example;

public class Stack {
     static int[] stack = new int[2];
     static int top=-1;
    public static void push(int a){

        System.out.println(top);
       if(top<stack.length){
           stack[++top]=a;
       }
        System.out.println(top);
    }
    public static int pop(){
        if (top>-1){
           return stack[top--];
        }

        System.out.println(top+"pop");
        return -1;
    }
    public static void main(String[] args) {
         push(2);
         push(3);
        pop();
        pop();
        int a = pop();
        System.out.println(a+"output");
//         pop();
//         pop();

    }
}
