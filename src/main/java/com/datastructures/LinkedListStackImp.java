package com.datastructures;

import org.w3c.dom.Node;

public class LinkedListStackImp {
	
	Node head;
	
	class Node{
		
		int value;
		Node next;
		
	}
	
	LinkedListStackImp(){
		
		head=null;
		
	}
	
	
	
	// add the value to the begining of the list
	public void push(int value) {
		
		Node  extrahead =  head;
		head = new Node(); // automatically  the new node will be created  to push the element
		head.value = value; //  this will assign the passed value to the  node value
		head.next = extrahead; // this will create the extra head after assigning the value
	}
	
	
	
	public int pop() {
		
		
		if (head== null) {  // checking the head value first before poping
			
			System.out.println("your stack is empty");
			
		}
		
		int value = head.value;
		head = head.next;
		return value;
		
		
	}
	
	public static void printLinkedList(Node head) {
		
		Node tempnode =  head;
		while (tempnode!=null) {
			
			System.out.println(tempnode.value + "  ");
			tempnode= tempnode.next;
		}
		
	}
	
	public static void main(String[] args) {
		
		LinkedListStackImp lst = new LinkedListStackImp();
		//lst.pop();
		lst.push(10);
		lst.push(20);
		lst.push(40);
		lst.push(80);
		lst.push(160);
		
		System.out.println("the element oped from the stack is " +  lst.pop()); // stack element will be poped and will be removed from the stack 
		System.out.println("the element oped from the stack is " +  lst.pop());// stack element will be poped and will be removed from the stack
		
		lst.push(65);
		System.out.println("the element oped from the stack is " +  lst.pop()); // stack element will be poped and will be removed from the stack 
		
		
		printLinkedList(lst.head);
	}
	
	
	
	
	
	

}
