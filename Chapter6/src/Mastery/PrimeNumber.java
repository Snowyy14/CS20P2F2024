package Mastery;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        try (Scanner userInput = new Scanner(System.in)) {

            // The user input
            System.out.print("Please enter your number: ");
            int number = userInput.nextInt();
            
            // The output for whether it's prime or not
            if (isPrime(number)) {
                System.out.println("It is a prime number");
            } else {
                System.out.println("It is not a prime number");
            }
        }
    }

    // This is the method to check if it's prime
    public static boolean isPrime(int number) {
        // Checks if the number is 1 or below; if so, it's instantly false
        if (number <= 1) {
            return false;
        }
        
        // Start by checking if it's divisible by 2 all the way to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // Checking for divisibility
            if (number % i == 0) {
                return false;
            }
        }
        // If nothing is found, return true
        return true;
    }
}
