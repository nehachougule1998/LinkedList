package com.bridgelabz;

public class LinkedList {
	Node head;
	Node tail;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}	
	}
	
	public void show() {
		Node  temp = head;
		while(temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
	}
	
	public void append(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}	
	}
	
	public void insertAtMiddle(int data) {
		Node newNode = new Node(data);
		if(head == null) {
		}
		else {
			 Node temp = head;
	           Node middle = head;
	            while (temp.next != null && temp.next.next != null)
	            {
	                temp = temp.next.next;
	                middle = middle.next;
	            }
	            newNode.next = middle.next;
	            middle.next = newNode;
		}
	}
	
	public void pop() {
		if(head == null) {
			System.out.print("empty");
		}
		head = head.next;
	}
}