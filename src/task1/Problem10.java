package task1;
import java.util.*;
public class Problem10 {

	public static void main(String[] args) {
		// Problem 10 you would need to provide an array of integers as input to the function that finds the next greater element.
		
		int[] numbers = { 1,2,3,4,5 };
		Arrays.sort(numbers);
		System.out.println("The second largest element is "+ numbers[numbers.length-2]);
		

	}

}
