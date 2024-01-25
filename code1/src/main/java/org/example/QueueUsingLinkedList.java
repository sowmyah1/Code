package org.example;

public class QueueUsingLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node fhead,rhead;
        public static void add(int data) {
            Node newNode = new Node(data);
             if(rhead == null){
                 rhead = newNode;
                 fhead=rhead;
                 System.out.println(data+"  Im frhead");
             }
             else{
                 rhead.next= newNode;
                 rhead=newNode;
                 System.out.println(data+"  Im rhead");
             }

        }
        public static int del(){
            if (fhead == null){
                return -1;
            }
            else{
                int a = fhead.data;
                fhead = fhead.next;
                fhead.next=null;
                return a;
            }
        }
        public static void display(){
            Node ptr = fhead;
            while(ptr!= null){
                System.out.println(ptr.data+"  hi");
                ptr = ptr.next;
            }
            System.out.println(ptr.data);
        }
    public static void main(String[] args) {
      add(2);
      add(3);
      add(4);
        System.out.println(del());
        display();
    }
}
