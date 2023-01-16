package task1;
import java.util.*;
public class Problem1 {

	public static void main(String[] args) {
		// Problem: Given an array of integers, write a function that finds the maximum product that can be formed by multiplying any four integers.
		//Input: [1, 2, 3, 4, 5, 6]
		//Output: 120 (6 * 5 * 4 * 3)
		
		
		int[] num= new int[] {1, 2, 3, 4, 5, 6}; // step 1 create array of integers
		Arrays.sort(num);  // step 2 sort the array 
		int[] highestFour= new int[4]; //step 3 create new array that will take highest four numbers from (num array)
		int count=0; // count will be responsible for the index number in highestFour array.
		for(int i=5;i>1;i--) { //this loop to take the highest 4 numbers from num array to highestFour array.
			highestFour[count]=num[i];
			count++;
		}
		int product=1; //product will be the result of product the highest four numbers in array.
		for(int i=0; i<4;i++) { //this loop to calculate the product result
			product=highestFour[i]*product;
		}
		
		
		
		System.out.println(product + " = ( " + highestFour[3] + " * "+highestFour[2] + " * " + highestFour[1] + " * " + highestFour[0] + ")");


	}

}
