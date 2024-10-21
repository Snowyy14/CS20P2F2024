package Mastery;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 try (Scanner userInput = new Scanner(System.in)) {

		        //user input
		        System.out.print("Please enter your number: ");
		        int Number = userInput.nextInt();
		        
		        
		       int o = 2;
		      
		       boolean prime = true;
		       //checking if the number is divisible by 1 and itself
		       while(o<Number) {
		    	   if (Number % o == 0) {
		    		   System.out.println("It is not prime number");
		    		   prime = false;
		    		  
		    		   //breaking because i dont want to repeat mutliple times
		    		   break;
		    	   }
		    	   
		    	   
		    	   o++;
		       }
		       //if the boolean is true
		       if (prime) {
		    	   System.out.println("It is a prime number");
		       }
		       
		       
		       
		       
		 }
	}
}