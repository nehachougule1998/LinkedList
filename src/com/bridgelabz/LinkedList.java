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
   public class Node {
		int data;
		Node next;
		
        public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
}