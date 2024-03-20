package org.example;

import java.util.Stack;

class Node {
         int data;
         Node left;
         Node right;

         Node(int data) {
             this.data = data;
             this.left = null;
             this.right = null;
         }
     }
public class TreesIterayiveTraversal {

            static void InorderTraversal(Node root){
                if(root ==null)
                        return;
                InorderTraversal(root.left);
                System.out.print(root.data+" ");
                InorderTraversal(root.right);
            }

            static void InorderTraversalIterativeApproach(Node root){
                if(root ==null)
                    return;
                Stack<Node>stk= new Stack<>();
                stk.push(root);
                while (!stk.isEmpty()){
                    if(root.left!=null){
                        stk.push(root.left);
                        root=root.left;
                    }
                    else{
                        System.out.print(root.data+" ");
                        while (!stk.isEmpty()&&root.right==null){
                            root=stk.peek();
                            stk.pop();
                            System.out.print(root.data+" ");
                        }
                        if(!stk.isEmpty()&&stk.peek().right!=null){
                            Node TopNode=stk.pop();
                            System.out.print(TopNode.data+" ");
                            stk.push(TopNode.right);
                        }
                        }
                    }
                }

    public static void main(String[] args) {
            Node root = new Node(1);
            root.left= new Node(2);
            root.right=new Node(3);
            root.left.left= new Node(4);
            root.left.right=new Node(5);
            root.left.right.left= new Node(6);
            root.left.right.left.left= new Node(7);
            root.right.left= new Node(8);
            root.right.right= new Node(9);
            root.right.right.left=new Node(10);
            InorderTraversal(root);
        System.out.println("---------------");
        InorderTraversalIterativeApproach(root);
    }

}
