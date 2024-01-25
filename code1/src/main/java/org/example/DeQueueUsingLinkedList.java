package org.example;

public class DeQueueUsingLinkedList {
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data= data;
            this.right =null;
            this.left =null;
        }
    }
    static Node fhead,rtail;
    public static void add(int data,boolean a) {
        Node newNode = new Node(data);

            if (fhead == null ) {
                fhead = newNode;
                rtail = newNode;
            }
            else if(a){

                //insert from front
                newNode.right = fhead;
                fhead.left =newNode;
                fhead = newNode;

            }
            else{
//                insert from rear of dequeue
                newNode.left =rtail;
                rtail.right=newNode;
                rtail= newNode;
            }
    }
    public static void display(){
        Node ptr = fhead;
        while(ptr != null){
            System.out.println(ptr.data);
            ptr = ptr.right;
        }

    }
    public static void main(String[] args) {
     add(1,true);
     add(2,true);
     add(3,true);
     add(4,false);
     add(5,false);
     add(6,false);
//        System.out.println(fhead.data+"  "+fhead.lnext);

     display();
    }
}
