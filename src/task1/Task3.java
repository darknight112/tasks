package task1;
import java.util.*;

public class Task3 {

	public static void main(String[] args) {
		int[] array= {1,2,22,2,2,3,4};
		Scanner sr = new Scanner(System.in);
		System.out.println("search for a number ");
		int input=sr.nextInt();
		int count=0;
		for(int e:array) {
			if(e==input) {
				count++;
			}
		}
		System.out.println(input+ " appers " + count+ " times in the array");

	}

}
