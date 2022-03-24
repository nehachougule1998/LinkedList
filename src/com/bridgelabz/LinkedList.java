package com.bridgelabz;

public class LinkedList {
	static Node head;
	Node tail;
	static int size;
	
	protected void add(int data) {
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
	
	protected void append(int data) {
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
	
	protected void insertAtMiddle(int data) {
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
	
	protected void popFirst() {
		if(head == null) {
			System.out.print("is empty");
		}
		head = head.next;
		size--;
	}
	
	protected Node popLast() {
		if(head == null || head.next == null) {
			return null;
		}
		size--;
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
 
        return head;
	}
	
	protected boolean searchNode(int node) {
		Node current = head;
		while(current != null) {
			if(current.data == node) {
				return true;
			}
		   current = current.next;
		}   
		return false;
	}	
	

	public void insertAtPosition(int newElement, int position) {
			
		Node newNode = new Node(position); 
	    newNode.data = newElement;
	    newNode.next = null;

	    if(position < 1) {
	    } else if (position == 1) {
	      newNode.next = head;
	      head = newNode;
	    } else {
	      
	      Node temp = new Node(position);
	      temp = head;
	      for(int i = 1; i < position-1; i++) {
	        if(temp != null) {
	          temp = temp.next;
	        }
	      }
	   
	      if(temp != null) {
	        newNode.next = temp.next;
	        temp.next = newNode;  
	      } else {
	      }       
	   }
	}
	
	public void removeElements(int key) {
		Node current = head;
		Node temp = null;
		
		if(current != null  && current.data == key) {
			head = current.next;
			return;
		}
		
		while(current != null  && current.data != key) {
			temp = current;
			current = current.next;
		}
		if(current == null) {
			return;
		}
		temp.next = current.next;
		size--;
	}
	
	public int getSize() {
		System.out.println();
		return size;
	}
	
}


