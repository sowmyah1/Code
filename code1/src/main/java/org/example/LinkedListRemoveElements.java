package org.example;

public class LinkedListRemoveElements {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    static  Node head;
    public static void addfirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            newNode.data= data;
            head= newNode;
        }
        else{
            newNode.data = data;
            newNode.next = head;
            head = newNode;
        }
    }
    public static void removeElementLast(){
        Node ptr = head;
        Node ptr2 = head;
        while(ptr.next!=null){
            ptr2= head.next;
        }
        ptr2.next=null;
    }

    public static void main(String[] args) {
        addfirst(2);
        addfirst(3);
        addfirst(4);
        removeElementLast();
        Node pointer = head;
        System.out.println(head.data);
        while(pointer.next!=null){
            System.out.println(pointer.data);
        }
        System.out.println(pointer.data);
    }
}
