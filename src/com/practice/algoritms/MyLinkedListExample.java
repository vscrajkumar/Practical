package com.practice.algoritms;

class MyListList{
	
	class Node{
		
		int data;
		Node prev;
		Node next;
		
		Node(Node prev,int data,Node next){
			this.prev=prev;
			this.next=next;
			this.data=data;
		}
	}
	
	Node head=null;
	Node tail=null;
	
	void push(int data){
		
		Node node=new Node(null,data,null);
		if(head==null){
			head=node;
			head.prev=null;
			head.next=null;
			tail=head;
		}
		else if(head!=null){
			Node previous=head;
			head=node;
			previous.prev=head;
			head.next=previous;
			
		}
	}
	void append(int data){
		Node node=new Node(null,data,null);
		if(head==null){
			head=node;
			tail=node;
		}
		else if(tail!=null){
			Node previous=tail;
			tail=node;
			previous.next=tail;
		}
		
	}
	void display(){
		
		while(head!=null){
			System.out.print(" "+head.data);
			head=head.next;
		}
	}
}
public class MyLinkedListExample {
	public static void main(String[] args) {
		MyListList obj=new MyListList();
		obj.push(2);
		obj.push(1);
		obj.append(4);

		obj.display();
	}

}
