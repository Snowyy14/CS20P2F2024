package Mastery;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        try (Scanner userInput = new Scanner(System.in)) {

            // the user input
            System.out.print("Please enter your number: ");
            int number = userInput.nextInt();
            
            // the output for whether its prime or not
            if (isPrime(number)) {
                System.out.println("It is a prime number");
            } else {
                System.out.println("It is not a prime number");
            }
        }
    }

    // this is the method to check if its prime
    public static boolean isPrime(int number) {
        // checks if the number is 1 or below; if so it's instantly false
        if (number <= 1) {
            return false;
        }
        
        // start by checking if it's divisible by 2 all the way to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // checking for divisibility
            if (number % i == 0) {
                return false;
            }
        }
        // if nothing is found it returns true
        return true;
    }
}