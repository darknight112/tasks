package task1;
import java.util.*;
public class RemovingIntegersDuplicates {

	public static void main(String[] args) {
		HashSet<Integer> integers = new HashSet<Integer>();
		Scanner sr = new Scanner(System.in);
		boolean condition=true;
		int count = 0;
		while(condition) {
			System.out.println("enter a number or 99 to exit ");
			int input=sr.nextInt();
			if(input==99) {
				System.out.println("exit ");
				condition=false;
			}
			else {
				integers.add(input);
				count++;
			}
		}


		count=count-integers.size();
	    System.out.println(integers);
	    System.out.println("the number of removed duplicates are "+ count);


	}

}
