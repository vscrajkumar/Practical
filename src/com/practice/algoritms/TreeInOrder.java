package com.practice.algoritms;
import java.util.Stack; 
  
/* Class containing left and right child of 
current node and key value*/

class TreeInOrder 
{ 
    Node root; 
    void inorder() 
    { 
        if (root == null) 
            return; 
  
  
        Stack<Node> s = new Stack<Node>(); 
        Node curr = root; 
  
        // traverse the tree 
        while (curr != null || s.size() > 0) 
        { 
  
          
            while (curr !=  null) 
            { 
                s.push(curr); 
                curr = curr.left; 
            } 
           
            curr = s.pop(); 
  
            System.out.print(curr.data + " "); 
  
           
            curr = curr.right; 
        } 
    } 
    public static void main(String args[]) 
    { 
    	TreeInOrder tree = new TreeInOrder(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.inorder(); 
    } 
} 
