package task1;

import java.util.*;

public class Problem6 {

	public static void main(String[] args) {
		// Problem: Given an array of integers, write a function to find the number of
		// times a given integer value appears in the array where the value is greater
		// than 10.
		// Input: [1, 2, 15, 20, 15, 30, 20, 15, 15], val = 15
		// Output: 4

		int[] numbers = { 1, 2, 20, 15, 15, 30, 15, 15 };
		Arrays.sort(numbers);
		int max=0;
		for (int i = 0; i < numbers.length; i++) {
			int count=0;
			for(int j=0;j<numbers.length;j++) {
				if (( numbers[i] == numbers[j] && numbers[i] >= 10)) {
					count++;
					
				}
			}
			if(count>0 && count>max) {
				max=count;
			}
			
			
		}
		System.out.println(max);

	}

}
