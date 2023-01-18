package task1;

import java.util.*;

public class Problem8 {

	public static void main(String[] args) {
		// Problem 8 Create a function in Java that checks whether a given string is a palindrome using a stack.
		// input mam
		// reverse = mam true

		Stack<String> stc = new Stack<String>();
		String name = "BOB";
		for(int i=0;i<name.length();i++) {
			char a=name.charAt(i);
			String aa = "" + a;		
			stc.push(aa);
		}
		String reverse="";
		for(int i=0;i<name.length();i++) {
			reverse=reverse+""+stc.pop();
			
			
		}
		if(name.equals(reverse)) {
			System.out.println("The word is same from both sides");
		}
		else {
			System.out.println("The word is not the same from both sides");
		}
		

	}

}
