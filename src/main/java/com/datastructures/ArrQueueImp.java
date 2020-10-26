package com.datastructures;

public class ArrQueueImp {
	
	int capacity;
	int queueArr[];
	int front;
	int rear;
	int currentqueuesize;
	
	
	public  ArrQueueImp(int sizeofqueue) {
		
		this.capacity= sizeofqueue;  // assigning the sizeof queue to capacity of queue
		front=0;                     // initial front  value 
		rear=-1;                     // initial rear value will be -1
		queueArr = new int[this.capacity]; //declaring an array of provided capacity size
		
	}
	
	
	public boolean isFull() {  //  checking if the queue is full
		
		if (currentqueuesize==capacity) {
			System.out.println("The queue is currently full");
			
			return true;
		}
		
		return false;
		
	}
	
	public boolean isEmpty() {         // checking if the queue is empty
		
		if (currentqueuesize==0) {
			System.out.println("The queue is currently empty");
			
			return true;
		}
		
		return false;
		
	}
	
	
	
	/***
	 * this function is used to insert the data into the queue
	 * 
	 * @param data
	 */
	public void enqueue(int data) { 
		
		if (isFull()) {
			System.out.println("The queue is already full, can not insert the data");
		}
		else {
			rear++;
			if (rear==capacity-1) {
				rear=0;
			}
			queueArr[rear]=data;
			currentqueuesize++;
			System.out.println(data+ " is inserted into the queue");
		}
	}
	
	/*
	 * 
	 *  this function is used to remove the element frm the que and decrease the size of queue by 1
	 */
	public void dequeue() {
		
		if (isEmpty()) {
			System.out.println("Hey, queue is already empty and can not delete any element from the queue");
			
		}
		front++;
		if (front==capacity-1) {
			System.out.println(queueArr[front-1] + " remved from the queue");
			front=0;
		}
		else {
			System.out.println(queueArr[front-1] + " remved from the queue");
		}
		currentqueuesize--;
	}
	
	public static void main(String[] args) {
		
		ArrQueueImp arrqinp = new ArrQueueImp(6);
		arrqinp.enqueue(10);
		arrqinp.enqueue(20);
		arrqinp.enqueue(30);
		arrqinp.dequeue();         /** if the queue size is full , then it acts as a normal array and  last inserted element will be removed*/
		arrqinp.dequeue();         /** try this code with adding elements more tha  the queue size*/
		arrqinp.enqueue(43);
		arrqinp.enqueue(54);
		arrqinp.enqueue(54);
		arrqinp.enqueue(63);
		arrqinp.dequeue();
		
		
	}

}
