package com.practice.algoritms;

class MyStack{
	
	class Node{
		
		int data;
		Node previous;
		Node(int data,Node node){
			this.data=data;
			this.previous=node;
		}
	}
	
	Node top=null;
	Node tail=null;
	void push(int data){
		Node node=new Node(data,null);
		if(top==null){
			top=node;
		}
		else{
			Node prev=top;
			node.previous=prev;
			top=node;
		}
	}
	
	void pop(){
		if(top==null){
			System.out.println("Node Stack Data");
		}
		else if (top!=null){
			
			if(top.previous==null){
				top=null;
			}else {
				top=top.previous;
			}
		}
	}
	void display(){
		Node tempTop=top;
		if(tempTop==null){
			System.out.println("Stack is Empty");
			return;
		}
		while(tempTop.previous!=null){
			System.out.print(" "+ tempTop.data);
			tempTop=tempTop.previous;
		}
		System.out.print(" "+ tempTop.data);
		System.out.println();

	}
}
public class MyStackExample {

	public static void main(String[] args) {
		MyStack stack=new MyStack();
		stack.display();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.display();
		stack.pop();
		stack.display();
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.display();
		stack.pop();
		stack.pop();
		stack.display();
	}
}
