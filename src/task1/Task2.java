package task1;
import java.util.*;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);
		boolean condition1=true;
		boolean condition2=true;

		Integer first;
		Integer second;
		do{
		
	        try {  
				System.out.println("please enter first number between 1 - 100");
	            first = sr.nextInt(); // we give big integer  value as input    
	            if(first>0 && first<100) {
	                    	 condition1=false;
	                     }
	        }   
	        catch (InputMismatchException ex) {  
                System.out.println("================you can only type an Integer==================");
	            condition1=true;
	            sr.next();

	       }  
	    }
	    while(condition1);


		do{
	        try {  
				System.out.println("please enter second number between 1 - 100");
	            second = sr.nextInt(); // we give big integer  value as input    
	            if(second>0 && second<100) {
	               condition2=false;
	           }
	        }   
	        catch (InputMismatchException ex) {  
                System.out.println("================you can only type an Integer==================");
	            condition2=true;
	            sr.next();

	                }  
	    }
	    
	    while(condition2);
	}
}
