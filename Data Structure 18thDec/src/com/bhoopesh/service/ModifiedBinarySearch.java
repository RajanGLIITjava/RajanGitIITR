package com.bhoopesh.service;

public class ModifiedBinarySearch {

	public int pivotedBinarySearch(int[] array, int length, int key) {
		
		int pivot = findPivotElement(array, 0, length-1);
		
		// if we did not find a pivot element, then array is not rotated at all
		if(pivot == -1)
			return binarySearchImplementation(array, 0, length-1, key);
		
		//if we found a pivot element
		else if(array[pivot] == key)
			return pivot;
		else if(array[0] <= key)  
			return binarySearchImplementation(array, 0, pivot-1, key);
		return binarySearchImplementation(array, pivot+1, length-1, key);
	}

	private int binarySearchImplementation(int[] array, int low, int high, int key) {
	
		if(high < low) {
			return -1;
		}
		
		int mid = (low + high)/2; 
		
		if(key == array[mid])
			return mid;
		else if(key > array[mid])
			return binarySearchImplementation(array, (mid +1), high, key);
		return binarySearchImplementation(array, low, (mid-1), key);
	}

	private int findPivotElement(int[] array, int low, int high) {
		
		if(high < low)
			return -1;
		else if(high == low)
			return low;
		
		int mid = (low + high)/2;
		
		if(mid < high && array[mid] > array[mid+1])
			return mid;
		else if(mid > low && array[mid] < array[mid-1])
			return mid-1;
		else if(array[low] >= array[mid])
			return findPivotElement(array, low, mid +1);
		else
			return findPivotElement(array, mid+1, high);
	}

}
