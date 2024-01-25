package org.example;

public class DeQueueUsingArray {
    static int[] dequeue = new int[5];
    static int  f1head=0,f1tail=0,r2tail=4,r2head=4;
    public static void add(int data, boolean a){
        if(a){
            //insert at front
        if(f1head<5) {
            dequeue[f1head++] = data;
            System.out.println("im "+data+ a);
        }
        }
        else{
            //insert at rear
            if(r2head>=0){
                dequeue[r2head--]=data;
                System.out.println("im "+data+ a);
            }
        }
    }
    public static int del(boolean a){
        if(a){
            //delete at rear
            return dequeue[f1tail--];
        }
        else{
            //delete at front
            return dequeue[r2tail--];
        }
    }
    public static void main(String[] args) {

        add(2,true);
        add(2,false);
        System.out.println(del(true));
        System.out.println(del(false));
    }
}
