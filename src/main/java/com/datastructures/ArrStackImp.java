package com.datastructures;

public class ArrStackImp {
	
	int size;
	int arr[];
	int top;
	
	ArrStackImp(int size){
		
		this.size=size;
		this.arr= new int[size];
		this.top = -1;
		
		
	}
	
	// the time complexity for all the operations is o(1)
	
	public void push(int element) {
		
		if (!isFull()) {
			top++;
			arr[top]= element;
			System.out.println("The pushed emenet is" + element);
			
		}
		else {
			
			System.out.println("The stack is full now");
		}
		
	}
	
	public int pop() {
		
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("The poped element is" + arr[returnedTop]);
			return arr[returnedTop];
			
		}
		else {
			System.out.println(" The stack is empty now");
			return -1;
					
		}
		
	}
	
	
	public boolean isEmpty() {
		
		return (top==-1);
				
	}
	
	
	public boolean isFull() {
		
		return (size-1 == top);
		
	}

	public int peek() {
		
		if (!this.isEmpty()) {
			
			return arr[top];
			
		}
		else {
			System.out.println("The stack is  empty");
			return -1;
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ArrStackImp stackim = new ArrStackImp(10);
		stackim.pop();
		
		System.out.println("*********************************************************************");
		stackim.push(10);
		stackim.push(20);
		stackim.push(30);
		stackim.push(40);
		stackim.push(50);
		stackim.push(60);
		stackim.push(70);
		
		System.out.println("*********************************************************************");
		
		System.out.println(stackim.peek());
		System.out.println("*********************************************************************");
		
		stackim.pop();
		stackim.pop();
		
		System.out.println(stackim.isEmpty());
		System.out.println(stackim.isFull());
		
		
	}
	
	
	
	
	
	
}
