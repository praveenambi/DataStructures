package com.datastructures;

import java.sql.Array;
import java.util.Arrays;

public class BinarySearchAlgo {
	
	// First condition of binary search is , the array should sorted  , if not sorted please sort it and then apply binary search
	// best case of binary search is O(1);
	// worst/average case kf binary search is O(LogkN)
	
	
	
	public static int binarySearch(int arr[], int searchelement, int lowindex, int highindex) {
		
		while (lowindex <=highindex) {  // if low index is less than high index  , the only will starft the  operation
			
			int midelement = (lowindex+highindex) /2;  // logic to find the midlement
			
			if (arr[midelement]==searchelement) { // if serach element is equal to midelemet , the time complexity is O(1)
				System.out.println("The search element is found at mid of the array at index "+ midelement);
				return midelement;
			}
			
			if (searchelement >arr[midelement]) {
				lowindex= midelement+1;
			}
				else {
					highindex= midelement-1;
				}	
			
		}
		return -1;   // id element is not found returnig -1 
		
	}
	
	
	
	public static void main(String[] args) {
		
		int arr[]= {66,2,4,6,8,10,12,14,5,56,1,9}; // its an unsorted array
		Arrays.sort(arr);                           // first sort this array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		int n = arr.length;
		int searchele = 10;
		int resultelement = binarySearch(arr, searchele, 0, n-1);  // static method is called directly
		
		if (resultelement==-1) {
			System.out.println("the search elememnt is not found  in the given array");
		}else { 
			System.out.println("the search element is found  at index " + resultelement);
		}
		
		
	}

}
