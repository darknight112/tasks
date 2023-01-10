package task1;
import java.util.*;
public class Task1 {

	public static void main(String[] args) {
		int[] array= {1,2,22,2};
		int largest=array[0];
		for (int i =0; i<array.length;i++) {
			if(array[i]>largest) {
				largest=array[i];
			}
		}
		System.out.println("largest number is "+ largest);

	}

}
