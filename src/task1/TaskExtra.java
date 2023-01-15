package task1;
import java.util.*;

public class TaskExtra {

	public static void main(String[] args) {
		int[] rice= {900,1200,1200,1210,900,750,1050};
		int[] wheat= {1100,1900,1500,1500,1500,1500,1400};
		int[] cotton= {200,700,300,290,600,750,350};
		int profitRice=rice[0];
		int profitWheat=wheat[0];
		int profitCotton=cotton[0];


		for(int i=0;i<6;i++){
		   int diffrence=rice[i]-rice[i+1];
		   rice[i]=diffrence;
		}
		

		for(int i=0;i<6;i++){
		    if (profitRice>rice[i+1]){
		        profitRice=rice[i+1];
		        
		    } 

		}		
		
		for(int i=0;i<6;i++){
		   int diffrence=wheat[i]-wheat[i+1];
		   wheat[i]=diffrence;
		}
		
		
		for(int i=0;i<6;i++){
		    if (profitWheat>wheat[i+1]){
		        profitWheat=wheat[i+1];
		        
		    } 

		}
		
		
		for(int i=0;i<6;i++){
		   int diffrence=cotton[i]-cotton[i+1];
		   cotton[i]=diffrence;
		}
		
		for(int i=0;i<6;i++){
		    if (profitCotton>cotton[i+1]){
		        profitCotton=cotton[i+1];
		        
		    } 

		}		
		
		System.out.println("The most profitable price of rice is "+profitRice);
		System.out.println("The most profitable price of wheat is "+profitWheat);
		System.out.println("The most profitable price of cotton is "+profitCotton);
		
	
	}

}
