package org.example;

public class LinkedListRemoveLoop {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // To handle cases where k is greater than the array length

        reverse(nums, 0, n - 1);
        for(int i:nums){
            System.out.print(i);
        }
        System.out.println();

        reverse(nums, 0, k - 1);
        for(int i:nums){
            System.out.print(i);
        }
        System.out.println();

        reverse(nums, k, n - 1);

        for(int i:nums){
            System.out.print(i);
        }
    }

    private static  void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
      rotate(new int[]{1,2,3,4,5,6,7},3);

    }
}
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

