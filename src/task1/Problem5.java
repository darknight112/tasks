package task1;

import java.util.*;

public class Problem5 {
	public static void longestDecSubarray(int arr[], int n) {

		int max = 1, len = 1, maxIndex = 0;	//max will store that maximum length of subarray, len will store the length of subarray
		// max index will store the index of highest number of the longest subarray
		for (int i = 1; i < n; i++) { // traverse the array from the 2nd element
			if (arr[i] < arr[i - 1]) { // if current element if greater than previous element then len++
				len++;
			}
			else {
				if (max < len) { //update the max if len is greater than max
					max = len;
					maxIndex = i - max; //assign the index of maximum number in the subarray by calculate the deffrence between current index and max length
				}
				len = 1; // reset 'len' to 1 , to calculate again

			}
		}

		if (max < len) { //comparing max to len and update the max and maxIndex
			max = len;
			maxIndex = n - max;
		}

		for (int i = maxIndex; i < max + maxIndex; i++) { // Print the elements of longest
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// Problem 5: Given an array of integers, write a function to find the longest decreasing subarray.
		// Input: [1, 2, 3, 4, 5, 4, 3, 2, 1]
		// Output: [5, 4, 3, 2, 1]
		int arr[] = {1, 2, 3, 4, 5, 4, 3, 2, 1};
		int n = arr.length;
		longestDecSubarray(arr, n);

	}

}
