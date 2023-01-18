package task1;
import java.util.*;
public class Problem7 {

	public static void main(String[] args) {
		// Problem: Given an array of integers, 
		// write a function to find the missing number in the array where the missing number should be a multiple of 5.
		// Input: [5, 10, 20, 25, 30],
		// Output: 15
		
		int[] numbers = { 5, 10, 20, 25, 30 };

		int count=0;
		while(count!=numbers.length) {
			if(numbers[count]/(count+1)!=5) {
				System.out.println(numbers[count-1]+5);
				break;
			}
			count++;
		}
		

	}

}
