package Mastery;
import java.util.Random;
import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();
		        
		    //making the variable
		    int Guess = 0;
		    
		    //making a random number between 1 and 20
		    int Number = random.nextInt(20) + 1;
		    
		    System.out.println("I have a number between 1 and 20 try to guess it.");
		    
		    //if statement so that if they get it wrong they can retry 
		    while (Guess != Number) {
		    	System.out.print("Enter your guess: ");
		    	
		    	Guess = scanner.nextInt();
		    	
		    	if (Guess < Number) { 
		    		System.out.println("The guess was incorrect please try again.");

		    	} else if (Guess > Number) {
		    		System.out.println("The guess was incorrect please try again.");

		    	} else {
		    		System.out.println("Correct!");
		    	}
		    	
		    		
		    	}
		    }
	}

