package task1;
import java.util.*;
public class Problem1 {

	public static void main(String[] args) {
		// Problem: Given an array of integers, write a function that finds the maximum product that can be formed by multiplying any four integers.
		//Input: [1, 2, 3, 4, 5, 6]
		//Output: 120 (6 * 5 * 4 * 3)
		
		
		int[] num= new int[] {1, 2, 3, 4, 5, 6}; // step 1 create array of integers
		//int[] highestFour= new int[4]; //step 3 create new array that will take highest four numbers from (num array)
		

		//int count=0; // count will be responsible for the index number in highestFour array.
		
		int a= maxProduct(num); //caling maxProduct function
		

		
		
		


	}
	public static int maxProduct(int num[]) { // method to find largest 4 numbers in the array from user then return the sum of the product.
		int product=1; //product will be the result of product the highest four numbers in array.
		Arrays.sort(num);  // step 2 sort the array 
		for(int i=2; i<6;i++) { //this loop to calculate the product result
			product=num[i]*product;
		}
		System.out.println(product + " = ( " + num[num.length-1] + " * "+num[num.length-2] + " * " + num[num.length-3] + " * " + num[num.length-4] + ")");

		return product;
	}
}


