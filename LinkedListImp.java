package com.ty;

public class LinkedListImp {
	Node head;
	void insert(int ele) {
		Node n=new Node();
		n.data=ele;
		n.next=null;
		if(head==null) {
			head=n;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=n;
		}
	}
	void display() {
		if(head==null) {
			System.out.println("List is Empty!!!!");
		}
		else {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}}


	int size() {
		int c=0;
		Node temp=head;
		while(temp!=null) {
			c++;
			temp=temp.next;
		}
		return c;
		
	}
	void insertFront(int ele) {
		Node n=new Node();
		n.data=ele;
		n.next=head;
		head=n;
	}
	void insert(int pos,int ele) {
		if(pos==1) {
			insertFront(ele);
		}
		else if(pos>size()) {
			System.out.println("Invalid Position!!!");
			
		}
		else {
			Node n=new Node();
			n.data=ele;
			n.next=null;
			Node temp=head;
			for(int i=1;i<pos-1;i++) {
				temp=temp.next;
			}
			n.next=temp.next;
			temp.next=n;
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	void delete(int pos) {
		if(pos>size()) {
			System.out.println("Invalid Postion!!!!");
		}
		else if(pos==1) {
			head=head.next;
		}
		else {
			Node temp=head;
			for(int i=1;i<pos-1;i++) {
				temp=temp.next;
			}
			Node d=temp.next;
			temp.next=d.next;
			d.next=null;
		}
	}
}
