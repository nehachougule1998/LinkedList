package com.bridgelabz;

public class LinkedList {
	static Node head;
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
	
	public static void show() {
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


public static boolean isempty() {
	if(head == null) {
		 return true;	
	}
    return false;
}

public static void push(int data) {
	  Node newNode = new Node(data);
	  if(isempty()) {
		  head = newNode;
		  return;
	  }
	  newNode.next = head;
	  head = newNode;
	  }

public static int pop() {
	if(isempty()) {
		return -1;
	}
	int top = head.data;
	head = head.next;
	return top;
}

public static int peek() {
	if(isempty()) {
		return -1;
	}
	return head.data;
}
	
	}

   	

