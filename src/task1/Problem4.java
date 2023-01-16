package task1;
import java.io.*;
import java.util.*;
public class Problem4 {

	public static void main(String[] args) {
		// Problem: Given an array of integers and a number k, write a function to determine if there are two distinct elements in the array that add up to k and both elements should be even number.
		// Input: [1, 2, 4, 6, 8, 10], k = 10
		// Output: true (2 + 8 = 10)

	    int[] arrayNumbers = {1, 2, 4, 6, 8, 10};
        int totalSum = 6;
        int first=0;
        int second=0;
        for(int i = 0 ; i<arrayNumbers.length ; i++) {
            for (int l=0 ; l<arrayNumbers.length ; l++) {
                if((arrayNumbers[i] %2==0) && (arrayNumbers[l] % 2== 0) && (arrayNumbers[i] + arrayNumbers[l] == totalSum) ){
                    first=arrayNumbers[i];
                    second=arrayNumbers[l];
                }	
            }
	    }
	    
	    System.out.println(" " +first+" + "+ second+" = " +totalSum);
	
		
	}

}
