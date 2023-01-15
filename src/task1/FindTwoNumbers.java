package task1;

import java.util.*;

public class FindTwoNumbers {

	public static void main(String[] args) {
		// Given an array of integers, find the two numbers that appear only once in the array.
		int[] num= {900,1200,1200,1210,900,750};
        Stack<Integer> stack = new Stack<Integer>(); //stack that will save the only two numbers that appear once.
        
	    for (int i = 0; i < 6; i++) { 
	    	 
	        int count = 0; //initialize count that will count the number if it appear more than one.
	   
	        for (int j = 0; j < 6; j++) { //second loop to check each number with the array.
	   
	          if (num[i] == num[j]) { //if num[i] (the checked number) will equal to other number in array -> count++.
	            count++;
	          }
	        }

	        if (count == 1) { //if the number appear only once in the array will be pushed to the stack.
	          stack.push(num[i]);
	        }
	      }
	    
	    System.out.println(stack); //print stack (two numbers that appear once).



	}

}
