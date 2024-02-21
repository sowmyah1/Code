//package org.example;
//
//public class LinkedListRemoveLoop {
//    class Node{
//        int a;
//        Node next;
//        Node(int a){
//            this.a = a;
//            this.next=null;
//        }
//    }
//    Node head,ptr,temp;
//    public void add(int a){
//        Node newnode = new Node(a);
//        if(head == null){
//            head =newnode;
//            ptr=head;
//        }
//        else{
//            if(a==4) {
//                temp = ptr;
//            }
//            else if (a==7){
//                ptr= newnode;
//                ptr.next=temp;
//            }
//            ptr.next=newnode;
//
//        }
//    }
//    public void display(){
//        Node qwerty = head;
//        while(qwerty.next)
//    }
//}
