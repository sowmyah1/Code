package org.example;

import java.util.Scanner;

public class LinkedListDemo {
    public static class Node{
        String data;

        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;
    // Addition of nodes
    public static void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            newNode.data=data;
            head=newNode;
        }
        else {
            newNode.data = data;
            newNode.next=head;
            head = newNode;
        }
    }
    public static void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            newNode.data=data;
            head = newNode;
        }
        else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newNode;
        }

    }

    public static void main(String[] args) {
     LinkedListDemo list = new LinkedListDemo();
//    addFirst("string");
//    addFirst(" im string2");
        addFirst("Im add at first");
        addFirst("Im add at first");
        addFirst("Im add at first");
    addLast("hello1");
    addLast("hello2");
    addLast("hello3");
    addLast("hello4");
    addLast("hello5");
    addLast("hello6");
    addLast("hello22");
    Node ptr = head;
//        System.out.println(ptr.data);
    while(ptr.next != null){
        System.out.println(ptr.data);
        ptr = ptr.next;
    }
        System.out.println(ptr.data);
    }
}
