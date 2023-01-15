package task1;

import java.util.HashSet;
import java.util.Scanner;

public class FindSecondHighestNumber {

	public static void main(String[] args) {

		HashSet<Integer> integers = new HashSet<Integer>();
		Scanner sr = new Scanner(System.in);
		boolean condition=true;
		while(condition) {
			System.out.println("enter a number or 99 to exit ");
			int input=sr.nextInt();
			if(input==99) {
				System.out.println("exit ");
				condition=false;
			}
			else {
				integers.add(input);
			}
		}


		int secondHighest=integers.size()-1;
	    System.out.println(secondHighest);
	}

}
