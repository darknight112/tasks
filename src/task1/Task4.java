package task1;

import java.util.*;

public class Task4 {

	public static void main(String[] args) {
		int[] array = { 2, 3, 4, 5, 1, 7, 10 };
		int totalSum = 5;
		for (int i = 0; i < array.length; i++) {
			for (int l = 1; l < array.length; l++) {
				if (array[i] + array[l] == totalSum) {
					System.out.println(
							"the pairs are====" + array[i] + "==== and ====" + array[l] + "====");
				}
			}
		}

	}

}
