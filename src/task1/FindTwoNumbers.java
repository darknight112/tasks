package task1;

import java.util.*;

public class FindTwoNumbers {

	public static void main(String[] args) {
		// Given an array of integers, find the two numbers that appear only once in the array.
		int[] num= {900,1200,1200,1210,900,750};
        Stack<Integer> stack = new Stack<Integer>();
        
	    for (int i = 0; i < 6; i++) {
	    	 
	        int count = 0;
	   
	        for (int j = 0; j < 6; j++) {
	   
	          if (num[i] == num[j]) {
	            count++;
	          }
	        }

	        if (count == 1) {
	          stack.push(num[i]);
	        }
	      }
	    
	    System.out.println(stack);



	}

}
