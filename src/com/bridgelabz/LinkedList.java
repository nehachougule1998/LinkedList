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
	

	public void popFirstelement() {
		if(head == null) {
			System.out.print("is empty");
		}
		head = head.next;
	}
	
	public Node popLastelement() {
		if(head == null || head.next == null) {
			return null;
		}
		Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
 
        return head;
	}
}