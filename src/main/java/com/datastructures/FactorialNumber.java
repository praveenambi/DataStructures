package com.datastructures;

public class FactorialNumber {
	
	
	public int factorial(int num ) {
		
		if (num>1) {
			num= num*factorial(num-1);
					
			
		}
		return num;
		
	}
	
	public static void main(String[] args) {
		
		FactorialNumber fact = new FactorialNumber();
		int factNumber = fact.factorial(6);
		System.out.println("The factorila of given number is " +  factNumber);
		
		
	}

}
