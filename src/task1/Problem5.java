package task1;
import java.io.*;
import java.util.*;

public class Problem5 {
	static int lds(int arr[], int n)
	{
	    int lds[] = new int[n];
	    int i, j, max = 0;
	    Stack<Integer> stack = new Stack<Integer>();
	    // Initialize LDS with 1
	    // for all index. The minimum
	    // LDS starting with any
	    // element is always 1
	    for (i = 0; i < n; i++)
	        lds[i] = 1;
	 
	    // Compute LDS from every
	    // index in bottom up manner
	    for (i = 1; i < n; i++) {
	        for (j = 0; j < i; j++) {
	            if (arr[i] < arr[j] && lds[i] < lds[j] + 1) {
	                lds[i] = lds[j] + 1;
	    			stack.push(lds[j] + 1);
	            }
	        }
	    }
	    // Select the maximum
	    // of all the LDS values
	    for (i = 0; i < n; i++) {
	        if (max < lds[i]) {
	            max = lds[i];
	            stack.push(max);
	        }
	    }
	    // returns the length
	    // of the LDS
	    System.out.println(stack);
	    return max;
	}
	public static void main(String[] args) {
		// Problem: Given an array of integers, write a function to find the longest decreasing subarray.
		// Input: [1, 2, 3, 4, 5, 4, 3, 2, 1]
		// Output: [5, 4, 3, 2, 1]
		
		//int[] arr= new int[] {1, 2, 3, 4, 5, 4,3,2,1,0};
		//Stack<Integer> stack = new Stack<Integer>();
		//for(int i=0;i<(arr.length-1);i++) {
			//for(int j=1;j<(arr.length-1);j++) {
				//if(arr[i]>arr[j] && arr[j]>arr[j+1]) {
					//stack.push(arr[i]);
				//}

			//}
		//}
		int arr[] = { 15, 27, 14, 38,
                63, 55, 46, 65, 85 };
  int n = arr.length;
  System.out.print("Length of LDS is " +
                           lds(arr, n));
  
	}

}
