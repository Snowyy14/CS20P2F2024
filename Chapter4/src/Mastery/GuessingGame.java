package Mastery;
import java.util.Random;
import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//making a random variable
        Random rand = new Random();
        
        //the program choosing a number between 1 and 20
        int randomNum = rand.nextInt(20);

        //user guessing
        try (Scanner userInput = new Scanner(System.in)) {
            System.out.print("Please guess the number between (1-20): ");
            int Guess = userInput.nextInt();

            //output
            if (Guess == randomNum) {
                System.out.print("You guessed the number!");
            } else {
                System.out.println("Better luck next time!");
                
                System.out.print("The number i was thinking of was " + randomNum);      
            }
        }
    }
}
