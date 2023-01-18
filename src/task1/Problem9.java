package task1;
import java.util.*;
public class Problem9 {

	public static void main(String[] args) {
		// problem 9 Given a list of integers, implement a stack in Java that can return the second largest element in O(1) time.
		Scanner sr = new Scanner(System.in);
		boolean condition=true;
		Stack<Integer> numbers = new Stack<Integer>();

		while(condition) {
			System.out.println("Please enter integer number or 999 to exit ");
			Integer input=sr.nextInt();
			if(input==999) {
				System.out.println("exit");
				condition=false;
			}
			else {
				numbers.push(input);
				numbers.sort(null);
				
			}
			
		}
		System.out.println("The second largest element is "+ numbers.indexOf(numbers.size()));

	}

}
