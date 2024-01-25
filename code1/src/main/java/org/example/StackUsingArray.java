package org.example;

public class StackUsingArray {
     static int[] stack1 = new int[2];
     static int top=-1;
    public static void push(int a){

       if(top<stack1.length){
           stack1[++top]=a;
       }
    }
    public static int pop(){
        if (top>-1){
           return stack1[top--];
        }

        System.out.println(top+"pop");
        return -1;
    }
    public static void display(){
        while(top != -1){
            System.out.println(stack1[top--]);
        }
//        for(int i=0;i< stack1.length;i++){
//            System.out.println(stack1[i]);
//        }
    }
    public static void main(String[] args) {
         push(2);
         push(3);
        pop();
        display();

    }
}
