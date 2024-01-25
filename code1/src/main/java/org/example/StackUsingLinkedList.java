package org.example;

public class StackUsingLinkedList {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
   static Node head;
    public static void push(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head= newNode;
        }
    }
    public static int pop(){
        int a;
        if(head== null){
            return -1;
        }
        else if(head.next == null){
            a=head.data;
            head =null;
            return a;

        }
        else{
            a= head.data;
            head=head.next;
            return a;
        }
    }
    public static int peek() {
        if (head == null) {
            return -1;
        } else {
            return head.data;
        }
    }

    public static void main(String[] args) {
        push(2);
        push(8);
        push(6);
        System.out.println(pop());
        System.out.println(peek());
    }
}
