package com.bridgelabz;

public class LinkedListMain {

	public static void main(String[] args) {
		System.out.println("welcome to linked list program");
		LinkedList list = new LinkedList();
		list.append(56);
		list.append(70);
		list.show();
		
		list.insertMiddle(30);
		list.show();		
	}

}
