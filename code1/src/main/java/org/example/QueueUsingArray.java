package org.example;

public class QueueUsingArray {
    int[] queue = new int[5];
    int front = 0,rear=0;
    public void add(int data){
        if(rear> queue.length){
            System.out.println("overflow");
        }
        else{
            queue[++rear]=data;
            System.out.println("the data in add"+queue[rear]);
        }
    }
    public int delete(){
        if(rear<front){
            System.out.println("underflow");

        }else {
            return queue[++front];
        }
        return -1;
    }
    public void display(){
        while(front< rear){
            System.out.println(queue[++front] +"  im display");
        }
    }
    public static void main(String[] args) {
           QueueUsingArray q = new QueueUsingArray();
           q.add(2);
           q.add(3);
           q.add(4);
           q.add(5);
        System.out.println(q.delete()+"  im del");
        System.out.println(q.delete()+"  im del");
           q.display();
    }
}
