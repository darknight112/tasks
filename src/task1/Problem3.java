package task1;

import java.util.Arrays;

public class Problem3 {

	public static void main(String[] args) {
		// Problem: Given an array of integers, write a function that finds the third highest number in the array.
		// Input: [1, 5, 9, 3, 7, 8, 2, 4, 6]
		// Output: 7
		int[] num= new int[] {5, 2, 3, 7, 5, 6}; // step 1 create array of integers
		Arrays.sort(num);  // step 2 sort the array 
		System.out.println("The third highest number is " + num[num.length-4]);
	}

}
